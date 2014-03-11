/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author widad
 */

public class ElementConstitutif implements Serializable {
    private static final long serialVersionUID = 1L;
   
   private String codeFormation;
  
    private String codeUe;
 
    private String codeEc;

    private int noEnseignant;
 
    private String designation;
    private String description;

    private int nbhCm;

    private int nbhTd;
 
    private int nbhTp;

    public ElementConstitutif() {
    }

  
    public ElementConstitutif(String codeFormation, String codeUe, String codeEc, int noEnseignant, String designation, String description, int nbhCm, int nbhTd, int nbhTp ) {
     this.codeFormation = codeFormation;
        this.codeUe = codeUe;
        this.codeEc = codeEc;
        this.noEnseignant=noEnseignant;
        this.designation=designation;
        this.description=description;
        this.nbhCm=nbhCm;
        this.nbhTd=nbhTd;
        this.nbhTp=nbhTp;
        
    }

  public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getCodeUe() {
        return codeUe;
    }

    public void setCodeUe(String codeUe) {
        this.codeUe = codeUe;
    }

    public String getCodeEc() {
        return codeEc;
    }

    public void setCodeEc(String codeEc) {
        this.codeEc = codeEc;
    }

    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbhCm() {
        return nbhCm;
    }

    public void setNbhCm(int nbhCm) {
        this.nbhCm = nbhCm;
    }

    public int getNbhTd() {
        return nbhTd;
    }

    public void setNbhTd(int nbhTd) {
        this.nbhTd = nbhTd;
    }

    public int getNbhTp() {
        return nbhTp;
    }

    public void setNbhTp(int nbhTp) {
        this.nbhTp = nbhTp;
    }

    
    @Override
    public String toString() {
        return "Enseignant.Gestionnaire.ElementConstitutif[ codeFormation=" + codeFormation + ", codeUe=" + codeUe + ", codeEc=" + codeEc + " ]";
    }
    
}
