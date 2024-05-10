package com.kapu.onpe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LocalVotacion {
    @Id
    private int idLocalVotacion;
    private String RazonSocial;
    
    public int getIdLocalVotacion() {
        return idLocalVotacion;
    }
    public void setIdLocalVotacion(int idLocalVotacion) {
        this.idLocalVotacion = idLocalVotacion;
    }
    public String getRazonSocial() {
        return RazonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }
    
}