package com.kapu.onpe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Provincia {
    @Id
    private int idProvincia;
    private String Detalle;
    public int getIdProvincia() {
        return idProvincia;
    }
    public void setIdProvincia(int idprovincia) {
        this.idProvincia = idprovincia;
    }
    public String getDetalle() {
        return Detalle;
    }
    public void setDetalle(String detalle) {
        Detalle = detalle;
    } 
}