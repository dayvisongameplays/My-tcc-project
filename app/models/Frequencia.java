package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import play.db.jpa.Model;

@Entity
public class Frequencia extends Model {

	@Temporal(TemporalType.TIME)
	public Date horaEntrada, horaSaida;

	//Novas Alterações 26/08/2018
	@OneToOne
	@JoinColumn(name = "sala_identifier")
	public Sala sala;
	
	@OneToOne
	@JoinColumn(name = "servidor_identifier")
	public Servidor servidor;

}
