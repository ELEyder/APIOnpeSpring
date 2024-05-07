package com.kapu.cinestar.controllers;

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

import com.kapu.cinestar.models.Cine;
import com.kapu.cinestar.models.Pelicula;
import com.kapu.cinestar.models.PeliculaCine;
import com.kapu.cinestar.models.PeliculaLong;
import com.kapu.cinestar.models.Tarifas;
import com.kapu.cinestar.repository.ICines;
import com.kapu.cinestar.repository.IPeliculaCine;
import com.kapu.cinestar.repository.IPeliculas;
import com.kapu.cinestar.repository.IPeliculasLong;
import com.kapu.cinestar.repository.ITarifas;

@RestController
@RequestMapping
@CrossOrigin
@Configuration
public class CinestarController extends WebMvcAutoConfiguration {
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

	@Autowired
	private IPeliculas iPelicula;

    @GetMapping("/peliculas/{id}")
	public List<Pelicula> getPeliculas(@PathVariable("id") String id) {
		String idd = "1";
		if (id.equals("estrenos")) {
			idd = "2";
		} 
		return (List<Pelicula>) iPelicula.getPeliculas(idd);
	}
    
	@Autowired
	private IPeliculasLong iPeliculaLong;

    @GetMapping("/pelicula/{id}")
	public List<PeliculaLong> getPelicula(@PathVariable("id") String id) {
		return (List<PeliculaLong>) iPeliculaLong.getPelicula(id);
	}

	@Autowired
	private ITarifas iTarifa;

    @GetMapping("/cines/{id}/tarifas")
	public List<Tarifas> getCineTarifas(@PathVariable("id") String id) {
		return (List<Tarifas>) iTarifa.getCineTarifas(id);
	}

	@Autowired
	private IPeliculaCine iPeliculaCine;

    @GetMapping("/cines/{id}/peliculas")
	public List<PeliculaCine> getCinePeliculas(@PathVariable("id") String id) {
		return (List<PeliculaCine>) iPeliculaCine.getCinePeliculas(id);
	}
}
