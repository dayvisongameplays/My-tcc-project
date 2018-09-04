package models;

import javax.persistence.Entity;

import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Usuario extends Model{
	
	@Required
	public String matricula;
	
	@Required
	public String senha;
	
	@Required
	@Email
	public String email;
}
