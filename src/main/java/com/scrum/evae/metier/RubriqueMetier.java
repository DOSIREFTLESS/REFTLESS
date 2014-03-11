package com.scrum.evae.metier;

import java.util.List;

import com.scrum.evae.metier.model.Rubrique;

public interface RubriqueMetier {

	List<Rubrique> listRubriques();
	int ajouterRubriqueEvaluation(int idRubrique,int idEvaluation);
	boolean retirerRubriqueEvaluation(int idRubriqueEvaluation);
	
}
