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

public class Question implements Serializable {
    
    private int idQuestion;
    
    private String type;
    
    private int noEnseignant;
    
    private int idQualificatif;
   
    private String intitulé;

    public Question() {
    }

    public Question(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public Question(int idQuestion, String type, String intitulé) {
        this.idQuestion = idQuestion;
        this.type = type;
        this.intitulé = intitulé;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public int getIdQualificatif() {
        return idQualificatif;
    }

    public void setIdQualificatif(int idQualificatif) {
        this.idQualificatif = idQualificatif;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }


    @Override
    public String toString() {
        return "Enseignant.Gestionnaire.Question[ idQuestion=" + idQuestion + " ]";
    }
    
}
