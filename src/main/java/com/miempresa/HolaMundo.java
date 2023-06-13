package com.miempresa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
	
	@RequestMapping("/saludar")
	public String Saludar() {
		String saludo = "<h1>Hola mundo desde <b>Spring Boot</b></h1>";
		saludo += "<hr><a href='/'>Volver a Enlaces</a> <hr>";
		return saludo;
	}
	
	@RequestMapping("/misdatos")
	public String MisDatos() {
		String nombres = "Ruben Freddy Quea Jacho";
		int edad = 20;
		String curso = "Desarrollo de Aplicaciones Web";
		String foto = "mundo.jpeg";
		
		String datos = "<table border=1>";
		datos += "<tr><td colspan=2><img src=" + foto + " width=800> <br> <center><h1>Por que JAVA?</h1></center> </td></tr>";
		datos += "<tr><td><h3>Me llamo</h3></td><td>" + nombres + "</td></tr>";
		datos += "<tr><td><h3>Mi edad es</h3></td><td>" + edad + "</td></tr>";
		datos += "<tr><td><h3>Estoy en el curso de</h3></td><td>" + curso + "</td></tr>";
		datos += "</table>";
		datos += "<hr><a href='/'>Volver a Enlaces</a> <hr>";
		return datos;
	}
	
	@RequestMapping("/")
	public String Indice() {
		String enlaces = "<a href='/saludar'>Mostrar Saludo</a> <hr>";
		enlaces += "<a href='/misdatos'>Mostrar Mis Datos</a> <hr>";
		enlaces += "<a href='/home'>Ir a Index</a><hr>";
		return enlaces;
	}
}
