package com.miempresa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.miempresa.DTO.formularioDTO;

@Controller
public class controladorFormulario {
	@GetMapping("/formularioRegistro")
	public String envioFormulario(Model model) {
		model.addAttribute("form", new formularioDTO());
		return "formulario";
	}
	
	@PostMapping("/formularioRegistro")
	public String recepcionFormulario(@ModelAttribute("form") @Validated formularioDTO form,BindingResult errores , Model model) {
		if (errores.hasErrors()) {
			return "formulario";
		}
		model.addAttribute("form", form);
		return "recepcion";
	}
}
