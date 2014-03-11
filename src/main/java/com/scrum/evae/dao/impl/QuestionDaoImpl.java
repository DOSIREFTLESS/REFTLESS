package com.scrum.evae.dao.impl;

import java.util.List;

import com.scrum.evae.dao.QuestionDAO;
import com.scrum.evae.metier.model.Question;

public class QuestionDaoImpl implements QuestionDAO {

	@Override
	public List<Question> getQuestions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int ajouterQuestionEvaluation(int idEvaluation, int idRubrique) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean retirerQuestionEvaluation(int idEvaluation, int idRubrique) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retirerQuestionEvaluation(int idQuestionEvaluation) {
		// TODO Auto-generated method stub
		return false;
	}

}
