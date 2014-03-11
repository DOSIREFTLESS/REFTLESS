package com.scrum.evae.metier.model;


import java.io.Serializable;

/**
 *
 * @author Amina LAARIM
 */
public class Droit implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private int idEvaluation;
    private int noEnseignant;
    private char consultation;
    private char duplication;

    public Droit() {
    }

    public Droit(int idEvaluation, int noEnseignant, char consultation, char duplication) {
        this.idEvaluation = idEvaluation;
        this.noEnseignant = noEnseignant;
        this.consultation = consultation;
        this.duplication = duplication;
    }
    

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getNoEnseignant() {
        return noEnseignant;
    }

    public void setNoEnseignant(int noEnseignant) {
        this.noEnseignant = noEnseignant;
    }

    public char getConsultation() {
        return consultation;
    }

    public void setConsultation(char consultation) {
        this.consultation = consultation;
    }

    public char getDuplication() {
        return duplication;
    }

    public void setDuplication(char duplication) {
        this.duplication = duplication;
    }

    public String toString() {
        return "reftlesssoft.Droit[ idEvaluation=" + idEvaluation + ", noEnseignant=" + noEnseignant  + " ]";
    }
    
}
