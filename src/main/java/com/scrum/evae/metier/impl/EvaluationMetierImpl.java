package com.scrum.evae.metier.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.scrum.evae.dao.EvaluationDAO;
import com.scrum.evae.metier.EvaluationMetier;
import com.scrum.evae.metier.model.Enseignant;
import com.scrum.evae.metier.model.Evaluation;

public class EvaluationMetierImpl implements EvaluationMetier{

	private EvaluationDAO evaluationDAO;
	
	public void setEvaluationDao(EvaluationDAO evaluationDAO) {
		this.evaluationDAO = evaluationDAO;
	}

	@Override
	public List<Evaluation> listEvaluation(int numEnseignant) {
		// TODO Auto-generated method stub
		return evaluationDAO.getEvalsEnseigant(numEnseignant);
	}
	
	@Override
	public int creerEvaluation(Evaluation evaluation){
		return evaluationDAO.creerEvaluation(evaluation);
		
	}
	
}
