/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;

import java.io.Serializable;


public class ReponseQuestion implements Serializable {
   

     private int idReponseQuestion;
    
    private int idQuestionEvaluation;

    
    private int positionnement;

    public ReponseQuestion() {
    }

    

    public ReponseQuestion(int idReponseQuestion, int idQuestionEvaluation, int positionnement) {
        this.idReponseQuestion = idReponseQuestion;
        this.idQuestionEvaluation = idQuestionEvaluation;
        this.positionnement = positionnement;
    
    }

   

   public int getIdReponseQuestion() {
        return idReponseQuestion;
    }

    public void setIdReponseQuestion(int idReponseQuestion) {
        this.idReponseQuestion = idReponseQuestion;
    }

    public int getIdQuestionEvaluation() {
        return idQuestionEvaluation;
    }

    public void setIdQuestionEvaluation(int idQuestionEvaluation) {
        this.idQuestionEvaluation = idQuestionEvaluation;
    }


    public Integer getPositionnement() {
        return positionnement;
    }

    public void setPositionnement(Integer positionnement) {
        this.positionnement = positionnement;
    }

  
    @Override
    public String toString() {
        return "Enseignant.Gestionnaire.ReponseQuestion[idReponseQuestion=" + idReponseQuestion + ", idQuestionEvaluation=" + idQuestionEvaluation + " ]";
    }
    
}
