package controllers;

import models.Administrador;
import play.mvc.Controller;

public class Logins extends Controller {

	public static void login() {
		render();
	}

	public static void autenticar(String email, String senha) {
		Administrador usuario = Administrador.find("email = ? and senha = ?", email, senha).first();
		if (usuario == null) {
			flash.error("Email ou senha inválidos");
			login();
		} else {
			Application.index();
		}
	}
}
