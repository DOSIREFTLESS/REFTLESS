/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;


import java.io.Serializable;


/**
 *
 * @author widad
 */

public class Qualificatif implements Serializable {
    
    private int idQualificatif;
    
    private String maximal;
    
    private String minimal;

    public Qualificatif() {
    }

    public Qualificatif(int idQualificatif) {
        this.idQualificatif = idQualificatif;
    }

    public Qualificatif(int idQualificatif, String maximal, String minimal) {
        this.idQualificatif = idQualificatif;
        this.maximal = maximal;
        this.minimal = minimal;
    }

    public int getIdQualificatif() {
        return idQualificatif;
    }

    public void setIdQualificatif(int idQualificatif) {
        this.idQualificatif = idQualificatif;
    }

    public String getMaximal() {
        return maximal;
    }

    public void setMaximal(String maximal) {
        this.maximal = maximal;
    }

    public String getMinimal() {
        return minimal;
    }

    public void setMinimal(String minimal) {
        this.minimal = minimal;
    }

   
    @Override
    public String toString() {
        return "Enseignant.Gestionnaire.Qualificatif[ idQualificatif=" + idQualificatif + " ]";
    }
    
}
