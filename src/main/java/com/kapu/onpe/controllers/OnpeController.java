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

import com.kapu.onpe.models.Acta;
import com.kapu.onpe.models.Departamento;
import com.kapu.onpe.models.Provincia;
import com.kapu.onpe.repository.IActa;
import com.kapu.onpe.repository.IDepartamento;
import com.kapu.onpe.repository.IProvincia;

@RestController
@RequestMapping
@CrossOrigin
@Configuration
public class OnpeController extends WebMvcAutoConfiguration {
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

	@Autowired
	private IActa iActa;
    
	@GetMapping("/actas/numero/{id}")
	public List<Acta> getActaNum(@PathVariable("id") String id) {
		return (List<Acta>) iActa.getActaNum(id);
	}

	@Autowired
	private IDepartamento iDepartamento;
    
	@GetMapping("/actas/ubigeo/{id}")
	public List<Departamento> getDepartamentos(@PathVariable("id") String id) {
		if (id.equals("Peru")){
			return (List<Departamento>) iDepartamento.getDepartamentos("1","25");
		} else {
			return (List<Departamento>) iDepartamento.getDepartamentos("26","30");
		}
	}

	@GetMapping("/actas/ubigeo/")
	public List<Departamento> getDepartamentos2() {
		return (List<Departamento>) iDepartamento.getDepartamentos("26","30");
	}

	@Autowired
	private IProvincia IProvincia;

	@GetMapping("/actas/ubigeo/{departamento}/{id}")
	public List<Provincia> getProvincias(@PathVariable("id") String id) {
		return (List<Provincia>) IProvincia.getProvincias(id);
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
