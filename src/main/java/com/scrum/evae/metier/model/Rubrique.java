/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;

import java.io.Serializable;



public class Rubrique implements Serializable {

    

    private int idRubrique;
   
    private String type;
   
    private String designation;
    
    private int ordre;
   
    private int noEnseignant;

    public Rubrique() {
    }

    public Rubrique(int idRubrique) {
        this.idRubrique = idRubrique;
    }

    public int getIdRubrique() {
        return idRubrique;
    }

    public void setIdRubrique(int idRubrique) {
        this.idRubrique = idRubrique;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    
    @Override
    public String toString() {
        return "Enseignant.Gestionnaire.Rubrique[ idRubrique=" + idRubrique + " ]";
    }
    
}
