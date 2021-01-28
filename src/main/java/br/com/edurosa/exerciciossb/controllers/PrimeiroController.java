package br.com.edurosa.exerciciossb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// @RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = "/ola")
	public String ola() {
		return "Olá Spring Boot!";
	}

}
