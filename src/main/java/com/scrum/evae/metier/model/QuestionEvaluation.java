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
public class QuestionEvaluation implements Serializable {
    private static final long serialVersionUID = 1L;
 
    private int idQuestionEvaluation;
    private int idRubriqueEvaluation;
    private int idQuestion;
    private int idQualificatif;
    private int ordre;
    private String intitule;

    public QuestionEvaluation() {
    }

    public QuestionEvaluation(int idQuestionEvaluation) {
        this.idQuestionEvaluation = idQuestionEvaluation;
    }

    public QuestionEvaluation(int idQuestionEvaluation, int idRubriqueEvaluation, int ordre) {
        this.idQuestionEvaluation = idQuestionEvaluation;
        this.idRubriqueEvaluation = idRubriqueEvaluation;
        this.ordre = ordre;
    }

    public int getIdQuestionEvaluation() {
        return idQuestionEvaluation;
    }

    public void setIdQuestionEvaluation(int idQuestionEvaluation) {
        this.idQuestionEvaluation = idQuestionEvaluation;
    }

    public int getIdRubriqueEvaluation() {
        return idRubriqueEvaluation;
    }

    public void setIdRubriqueEvaluation(int idRubriqueEvaluation) {
        this.idRubriqueEvaluation = idRubriqueEvaluation;
    }

    public int getIdQuestion() {
        return idQuestion;
    }

    public void setIdQuestion(int idQuestion) {
        this.idQuestion = idQuestion;
    }

    public int getIdQualificatif() {
        return idQualificatif;
    }

    public void setIdQualificatif(int idQualificatif) {
        this.idQualificatif = idQualificatif;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "reftlesssoft.QuestionEvaluation[ idQuestionEvaluation=" + idQuestionEvaluation + " ]";
    }
    
}
