package com.kapu.onpe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Departamento {
    @Id
    private int idDepartamento;
    private String Detalle;
    public int getIdDepartamento() {
        return idDepartamento;
    }
    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    public String getDetalle() {
        return Detalle;
    }
    public void setDetalle(String detalle) {
        Detalle = detalle;
    } 
}