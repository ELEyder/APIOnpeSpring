package com.kapu.onpe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.kapu.onpe.models.Cine;
import com.kapu.onpe.repository.ICines;

@RestController
@RequestMapping
@CrossOrigin
@Configuration
public class OnpeController extends WebMvcAutoConfiguration {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @Autowired
	private ICines iCine;

    @GetMapping("/cines")
	public List<Cine> getCines() {
			return (List<Cine>) iCine.getCines();
		}

    @GetMapping("/cines/{id}")
	public List<Cine> getCine(@PathVariable("id") String id) {
		return (List<Cine>) iCine.getCine(id);
	}

	// @Autowired
	// private IPeliculas iPelicula;

    // @GetMapping("/peliculas/{id}")
	// public List<Pelicula> getPeliculas(@PathVariable("id") String id) {
	// 	String idd = "1";
	// 	if (id.equals("estrenos")) {
	// 		idd = "2";
	// 	} 
	// 	return (List<Pelicula>) iPelicula.getPeliculas(idd);
	// }
}
