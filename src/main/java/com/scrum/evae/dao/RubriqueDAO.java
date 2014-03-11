package com.scrum.evae.dao;

import java.util.List;

import com.scrum.evae.metier.model.Rubrique;
import com.scrum.evae.metier.model.RubriqueEvaluation;

public interface RubriqueDAO {

	List<Rubrique> getRubriques();
	int ajouterRubriqueEvaluation(int idEvaluation , int idRubrique);
	boolean retirerRubriqueEvaluation(int idEvaluation,int idRubrique);
	boolean retirerRubriqueEvaluation(int idRubriqueEvaluation);
}
