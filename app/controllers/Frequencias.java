package controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import models.Frequencia;
import models.Sala;
import models.Servidor;
import play.mvc.Controller;

public class Frequencias extends Controller {

	public static void formFrequencia() {
		List<Sala> salas = Sala.findAll();
		List<Servidor> servidores = Servidor.findAll();
		render(salas, servidores);
	}

	public static void salvar(Frequencia frequencia) {
		SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
		String hini = params.get("frequencia.horaEntrada");
		String hfim = params.get("frequencia.horaSaida");
		Date inicio = null;
		Date fim = null;

		try {
			inicio = formato.parse(hini);
			fim = formato.parse(hfim);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		frequencia.horaEntrada = inicio;
		frequencia.horaSaida = fim;
		frequencia.save();
		listar();
	}

	public static void listar() {
		List<Frequencia> frequencias = Frequencia.findAll();
		render(frequencias);
	}

	public static void deletar(Long id) {
		Frequencia frequencia = Frequencia.findById(id);
		frequencia.delete();
		listar();
	}

	public static void editar(Long id) {
		Frequencia frequencia = Frequencia.findById(id);
		renderTemplate("Frequencias/formFrequencia.html", frequencia);
	}

}
