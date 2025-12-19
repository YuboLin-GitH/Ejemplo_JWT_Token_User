package es.softtek.jwtDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductoController {



	@GetMapping("productos/producto")
	public String findEquiposByproducto(){
		return "Listado del producto ";
	}
}
