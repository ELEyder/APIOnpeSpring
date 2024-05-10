package com.kapu.onpe.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Participacion {
    @Id
    private String DPD;
    private String TV;
    private String PTV;
    private String TA;
    private String PTA;
    private String EH;
    
    public String getDPD() {
        return DPD;
    }
    public void setDPD(String dPD) {
        DPD = dPD;
    }
    public String getTV() {
        return TV;
    }
    public void setTV(String tV) {
        TV = tV;
    }
    public String getPTV() {
        return PTV;
    }
    public void setPTV(String pTV) {
        PTV = pTV;
    }
    public String getTA() {
        return TA;
    }
    public void setTA(String tA) {
        TA = tA;
    }
    public String getPTA() {
        return PTA;
    }
    public void setPTA(String pTA) {
        PTA = pTA;
    }
    public String getEH() {
        return EH;
    }
    public void setEH(String eH) {
        EH = eH;
    }
    

}
