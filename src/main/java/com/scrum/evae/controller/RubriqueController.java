package com.scrum.evae.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.scrum.evae.metier.RubriqueMetier;
import com.scrum.evae.metier.model.Enseignant;
import com.scrum.evae.metier.model.Evaluation;
import com.scrum.evae.metier.model.Rubrique;


public class RubriqueController extends AbstractController {

	private RubriqueMetier rubriqueMetier;

	public void setRubriqueMetier(RubriqueMetier rubriqueMetier) {
		this.rubriqueMetier = rubriqueMetier;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
						
			
//List<Rubrique> listRubrique = rubriqueMetier.listRubriques(idEvaluation);

List <Rubrique> Rubriques =new ArrayList<>();
Evaluation e=new Evaluation();
Rubrique r=new Rubrique();
for(int i=0;i<Rubriques.size();i++){
rubriqueMetier.ajouterRubriqueEvaluation(e.getIdEvaluation(),r.getIdRubrique());
}

//		Map<String, Object> attributes = new HashMap<String, Object>();
//		attributes.put("rubriques", listRubrique);		
//		attributes.put("message", "L'action sur les rubriques a bien été traitée");
//      List<Rubrique> listRubrique = new ArrayList<Rubrique>();		
//		Evaluation eval = new Evaluation();
//		ens.set("");
//		ens.set("");
//		listRubrique.add(eval);
		
		req.setAttribute("listRubrique", Rubriques);	

		return new ModelAndView("rubrique");
		
	}

}