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

public class RubriqueEvaluation implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int idRubriqueEvaluation;
    private int idEvaluation;
    private int idRubrique;
    private int ordre;
    private String designation;

    public RubriqueEvaluation() {
    }

    public RubriqueEvaluation(int idRubriqueEvaluation) {
        this.idRubriqueEvaluation = idRubriqueEvaluation;
    }

    public RubriqueEvaluation(int idEvaluation, int idRubrique, int ordre) {
        this.idEvaluation = idEvaluation;
        this.idRubrique = idRubrique;
        this.ordre = ordre;
        this.idRubriqueEvaluation=3;
		this.designation="";
    }

    
    public RubriqueEvaluation(int idEvaluation, int idRubrique) {
		super();
		this.idEvaluation = idEvaluation;
		this.idRubrique = idRubrique;
		this.idRubriqueEvaluation=3;
		this.designation="";
		
	}

	public RubriqueEvaluation(int idRubriqueEvaluation, int idEvaluation,
			int idRubrique, int ordre, String designation) {
		super();
		this.idRubriqueEvaluation = idRubriqueEvaluation;
		this.idEvaluation = idEvaluation;
		this.idRubrique = idRubrique;
		this.ordre = ordre;
		this.designation = designation;
	}

	public int getIdRubriqueEvaluation() {
        return idRubriqueEvaluation;
    }

    public void setIdRubriqueEvaluation(int idRubriqueEvaluation) {
        this.idRubriqueEvaluation = idRubriqueEvaluation;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public int getIdRubrique() {
        return idRubrique;
    }

    public void setIdRubrique(int idRubrique) {
        this.idRubrique = idRubrique;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public String toString() {
        return "reftlesssoft.RubriqueEvaluation[ idRubriqueEvaluation=" + idRubriqueEvaluation + " ]";
    }
    
}
