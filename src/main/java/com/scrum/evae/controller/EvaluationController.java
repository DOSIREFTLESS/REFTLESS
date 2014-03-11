package com.scrum.evae.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.scrum.evae.metier.EnseignantMetier;
import com.scrum.evae.metier.EvaluationMetier;
import com.scrum.evae.metier.model.Enseignant;
import com.scrum.evae.metier.model.Evaluation;





public class EvaluationController extends AbstractController {

	private EvaluationMetier evaluationMetier;

	public void setEvaluationMetier(EvaluationMetier evaluationMetier) {
		this.evaluationMetier = evaluationMetier;
	}
	
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
						
		List<Evaluation> listEvaluation = evaluationMetier.listEvaluation(Integer.parseInt(req.getParameter("no_enseignant")));
		
		req.setAttribute("listEvaluation", listEvaluation);	

		return new ModelAndView("evaluation");
		
	}

}
