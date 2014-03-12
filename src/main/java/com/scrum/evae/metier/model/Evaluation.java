package com.scrum.evae.metier.model;

import java.io.Serializable;
import java.util.Date;

public class Evaluation implements Serializable {
    private static final long serialVersionUID = 1L;
   
    private int idEvaluation;
    private int noEnseignant;
    private String codeFormation;
    private String anneePro;
    private String codeUe;
    private String codeEc;
    private int noEvaluation;
    private String etat;
    private String periode;
    private Date debutReponse;
    private Date finReponse;
    private String designation;

    public Evaluation() {
    }

    public Evaluation(Integer idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public Evaluation(Integer idEvaluation, int noEnseignant, String codeFormation, String anneePro, String codeUe, int noEvaluation, String etat, Date debutReponse, Date finReponse) {
        this.idEvaluation = idEvaluation;
        this.noEnseignant = noEnseignant;
        this.codeFormation = codeFormation;
        this.anneePro = anneePro;
        this.codeUe = codeUe;
        this.noEvaluation = noEvaluation;
        this.etat = etat;
        this.debutReponse = debutReponse;
        this.finReponse = finReponse;
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

    public String getCodeFormation() {
        return codeFormation;
    }

    public void setCodeFormation(String codeFormation) {
        this.codeFormation = codeFormation;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
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

    public int getNoEvaluation() {
        return noEvaluation;
    }

    public void setNoEvaluation(int noEvaluation) {
        this.noEvaluation = noEvaluation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public Date getDebutReponse() {
        return debutReponse;
    }

    public void setDebutReponse(Date debutReponse) {
        this.debutReponse = debutReponse;
    }

    public Date getFinReponse() {
        return finReponse;
    }

    public void setFinReponse(Date finReponse) {
        this.finReponse = finReponse;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String toString() {
        return "reftlesssoft.Evaluation[ idEvaluation=" + idEvaluation + " ]";
    }
    

}
