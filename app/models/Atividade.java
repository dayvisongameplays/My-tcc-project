package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity

public class Atividade extends Model{
	
	public String nome;
	public String descricao;
	

}
