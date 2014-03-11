package com.scrum.evae.metier;


import java.util.List;

import com.scrum.evae.metier.model.Evaluation;

public interface EvaluationMetier {
	
	
	public List<Evaluation> listEvaluation(int numEnseignant);
	int creerEvaluation(Evaluation evaluation);
	
}
