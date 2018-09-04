package controllers;

import java.util.List;

import models.Atividade;
import models.Servidor;
import play.mvc.Controller;

public class Atividades extends Controller{
	
	public static void formAtividade() {
		render();
	}
	
	public static void salvar(Atividade atividade) {
		atividade.save();
		listar();
	}
	
	public static void listar() {
		List<Atividade> atividades = Atividade.findAll();
		render(atividades);
	}
	
	public static void listarBase() {
		List<Atividade> atividades = Atividade.findAll();
		render(atividades);
	}
	
	public static void deletar(Long id) {
		Atividade atividade = Atividade.findById(id);
		atividade.delete();
		listar();
	}

	public static void editar(Long id) {
		Atividade atividade = Atividade.findById(id);
		renderTemplate("Atividades/formAtividade.html", atividade);
	}

}
