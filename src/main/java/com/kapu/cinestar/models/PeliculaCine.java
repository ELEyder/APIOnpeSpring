package com.kapu.cinestar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PeliculaCine {
    @Id
    private String Titulo;
    private String Horarios;
    
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getHorarios() {
        return Horarios;
    }
    public void setHorarios(String horarios) {
        Horarios = horarios;
    }
    

}
