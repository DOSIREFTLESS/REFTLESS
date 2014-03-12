package com.scrum.evae.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.scrum.evae.metier.EvaluationMetier;
import com.scrum.evae.metier.model.Evaluation;

public class ListEvaluationController extends AbstractController {

	private EvaluationMetier evaluationMetier;

	public void setEvaluationMetier(EvaluationMetier evaluationMetier) {
		this.evaluationMetier = evaluationMetier;
	}
	
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String no_enseignant = request.getParameter("listEnseigant");

		List<Evaluation> listEvaluation = evaluationMetier.listEvaluation(Integer.parseInt(no_enseignant));

//		List<Evaluation> listEvaluation = new ArrayList<Evaluation>();		
//		Evaluation evae = new Evaluation();
//		evae.setCodeFormation("M2 DOSI");
//		evae.setAnneePro("2012-2013");
//		evae.setEtat("en cours d'élaboration");
//		evae.setDesignation("hhhhh");
//		listEvaluation.add(evae);

//		Map<String, Object> attributes = new HashMap<String, Object>();
//		attributes.put("evaluations", listEvaluation);
//		attributes.put("message", "L'action sur les evaluations a bien été traitée");
//		
		request.setAttribute("listEvaluation", listEvaluation);

		
		
		

		return new ModelAndView("listEvaluation");
	}

}
