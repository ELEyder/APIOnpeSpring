package com.kapu.cinestar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PeliculaLong {
    @Id
    private int id;
    private String Titulo;
    private String FechaEstreno;
    private String Director;
    private String Generos;
    private String idClasificacion;
    private String idEstado;
    private String Duracion;
    private String Link;
    private String Reparto;
    private String Sinopsis;
    private String Geneross;
    private String FechaEstrenoss;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public String getFechaEstreno() {
        return FechaEstreno;
    }
    public void setFechaEstreno(String fechaEstreno) {
        FechaEstreno = fechaEstreno;
    }
    public String getDirector() {
        return Director;
    }
    public void setDirector(String director) {
        Director = director;
    }
    public String getGeneros() {
        return Generos;
    }
    public void setGeneros(String generos) {
        Generos = generos;
    }
    public String getIdClasificacion() {
        return idClasificacion;
    }
    public void setIdClasificacion(String idClasificacion) {
        this.idClasificacion = idClasificacion;
    }
    public String getIdEstado() {
        return idEstado;
    }
    public void setIdEstado(String idEstado) {
        this.idEstado = idEstado;
    }
    public String getDuracion() {
        return Duracion;
    }
    public void setDuracion(String duracion) {
        Duracion = duracion;
    }
    public String getLink() {
        return Link;
    }
    public void setLink(String link) {
        Link = link;
    }
    public String getReparto() {
        return Reparto;
    }
    public void setReparto(String reparto) {
        Reparto = reparto;
    }
    public String getSinopsis() {
        return Sinopsis;
    }
    public void setSinopsis(String sinopsis) {
        Sinopsis = sinopsis;
    }
    public String getGeneross() {
        return Geneross;
    }
    public void setGeneross(String geneross) {
        Geneross = geneross;
    }
    public String getFechaEstrenoss() {
        return FechaEstrenoss;
    }
    public void setFechaEstrenoss(String fechaEstrenoss) {
        FechaEstrenoss = fechaEstrenoss;
    }
    

}
