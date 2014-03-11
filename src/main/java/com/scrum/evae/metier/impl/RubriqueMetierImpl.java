package com.scrum.evae.metier.impl;

import java.util.List;

import com.scrum.evae.dao.RubriqueDAO;
import com.scrum.evae.metier.RubriqueMetier;
import com.scrum.evae.metier.model.Rubrique;




public class RubriqueMetierImpl implements RubriqueMetier{

	private RubriqueDAO rubriqueDAO;
	
	public void setRubriqueDao(RubriqueDAO rubriqueDAO) {
		this.rubriqueDAO =rubriqueDAO;
	}
	
	@Override
	public List<Rubrique> listRubriques() {
		return rubriqueDAO.getRubriques();
	}

	@Override
	public int ajouterRubriqueEvaluation(int idRubrique,int idEvaluation) {
		return rubriqueDAO.ajouterRubriqueEvaluation(idRubrique, idEvaluation);
	  
	}


	@Override
	public boolean retirerRubriqueEvaluation(int idRubriqueEvaluation) {
	    return rubriqueDAO.retirerRubriqueEvaluation(idRubriqueEvaluation);

	}
	
	
}
