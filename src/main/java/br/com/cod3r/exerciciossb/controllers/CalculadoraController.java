package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculadoraController {

	//calculadora/somar/10/20
	//calculadora/subtrair?a=100&b=39
	
	@GetMapping("/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	@GetMapping
	public int subtrair(@RequestParam(name="a") int a, @RequestParam(name="b") int b) {
		return a - b;
	}
	
	
}