package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import play.data.validation.Required;
import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Servidor extends Model {

	public int matricula;
	public String nomeServidor;
	public String email;
	@Required
	public Blob foto;

	@OneToOne(mappedBy = "servidor")
	public Frequencia frequencia;

}
