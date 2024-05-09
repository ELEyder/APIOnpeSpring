package com.kapu.onpe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Acta {
    @Id
    private String idGrupoVotacion;
    private String idLocalVotacion;
    private String Departamento;
    private String Provincia;
    private String Distrito;
    private String RazonSocial;
    private String Direccion;
    private String nCopia;
    private String idEstadoActa;
    private String ElectoresHabiles;
    private String TotalVotantes;
    private String P1;
    private String P2;
    private String VotosBlancos;
    private String VotosNulos;
    private String VotosImpugnados;
    
    public String getIdGrupoVotacion() {
        return idGrupoVotacion;
    }
    public void setIdGrupoVotacion(String idGrupoVotacion) {
        this.idGrupoVotacion = idGrupoVotacion;
    }
    public String getIdLocalVotacion() {
        return idLocalVotacion;
    }
    public void setIdLocalVotacion(String idLocalVotacion) {
        this.idLocalVotacion = idLocalVotacion;
    }
    public String getDepartamento() {
        return Departamento;
    }
    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }
    public String getProvincia() {
        return Provincia;
    }
    public void setProvincia(String provincia) {
        Provincia = provincia;
    }
    public String getDistrito() {
        return Distrito;
    }
    public void setDistrito(String distrito) {
        Distrito = distrito;
    }
    public String getRazonSocial() {
        return RazonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public String getnCopia() {
        return nCopia;
    }
    public void setnCopia(String nCopia) {
        this.nCopia = nCopia;
    }
    public String getIdEstadoActa() {
        return idEstadoActa;
    }
    public void setIdEstadoActa(String idEstadoActa) {
        this.idEstadoActa = idEstadoActa;
    }
    public String getElectoresHabiles() {
        return ElectoresHabiles;
    }
    public void setElectoresHabiles(String electoresHabiles) {
        ElectoresHabiles = electoresHabiles;
    }
    public String getTotalVotantes() {
        return TotalVotantes;
    }
    public void setTotalVotantes(String totalVotantes) {
        TotalVotantes = totalVotantes;
    }
    public String getP1() {
        return P1;
    }
    public void setP1(String p1) {
        P1 = p1;
    }
    public String getP2() {
        return P2;
    }
    public void setP2(String p2) {
        P2 = p2;
    }
    public String getVotosBlancos() {
        return VotosBlancos;
    }
    public void setVotosBlancos(String votosBlancos) {
        VotosBlancos = votosBlancos;
    }
    public String getVotosNulos() {
        return VotosNulos;
    }
    public void setVotosNulos(String votosNulos) {
        VotosNulos = votosNulos;
    }
    public String getVotosImpugnados() {
        return VotosImpugnados;
    }
    public void setVotosImpugnados(String votosImpugnados) {
        VotosImpugnados = votosImpugnados;
    }
}
