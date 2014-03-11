/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;


import java.io.Serializable;

/**
 *
 * @author Amina LAARIM
 */  

public class RubriqueQuestion implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idRubrique;
    private int idQuestion;
    private int ordre;

    public RubriqueQuestion() {
    }

    public RubriqueQuestion(int idRubrique, int idQuestion, int ordre) {
        this.idRubrique = idRubrique;
        this.idQuestion = idQuestion;
        this.ordre = ordre;
    }

    public int getIdRubrique() {
        return idRubrique;
    }

    public void setIdRubrique(int idRubrique) {
        this.idRubrique = idRubrique;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }
    
    public String toString() {
        return "reftlesssoft.RubriqueQuestion[ idRubrique=" + idRubrique + ", idQuestion=" + idQuestion + " ]";
    }
    
}
