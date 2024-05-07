package com.kapu.cinestar.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Tarifas {
    @Id
    private String DiasSemana;
    private String Precio;

    public String getDiasSemana() {
        return DiasSemana;
    }
    public void setDiasSemana(String diasSemana) {
        DiasSemana = diasSemana;
    }
    public String getPrecio() {
        return Precio;
    }
    public void setPrecio(String precio) {
        Precio = precio;
    }
    
}
