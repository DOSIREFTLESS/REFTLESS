package com.scrum.evae.dao;

import java.util.List;

import com.scrum.evae.metier.model.Question;
import com.scrum.evae.metier.model.Rubrique;

public interface QuestionDAO {

	List<Question> getQuestions();
	int ajouterQuestionEvaluation(int idEvaluation , int idRubrique);
	boolean retirerQuestionEvaluation(int idEvaluation,int idRubrique);
	boolean retirerQuestionEvaluation(int idQuestionEvaluation);
}
