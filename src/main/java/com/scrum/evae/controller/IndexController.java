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

import com.scrum.evae.metier.EnseignantMetier;
import com.scrum.evae.metier.model.Enseignant;





public class IndexController extends AbstractController {

	private EnseignantMetier enseignantMetier;

	public void setEnseignantMetier(EnseignantMetier enseignantMetier) {
		this.enseignantMetier = enseignantMetier;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
						
		
		List<Enseignant> listEnseignant = enseignantMetier.listEnseignant();
		
//		Map<String, Object> attributes = new HashMap<String, Object>();
//		attributes.put("enseignants", listEnseignant);		
//		attributes.put("message", "L'action sur les enseignants a bien �t� trait�e");
//		
//		List<Enseignant> listEnseignant = new ArrayList<Enseignant>();		
//		Enseignant ens = new Enseignant();
//		ens.setNoEnseignant(7);
//		ens.setNom("BIANE");
//		ens.setPrenom("Med");
//		listEnseignant.add(ens);
//		
//		Enseignant ens1 = new Enseignant();
//		ens1.setNoEnseignant(3);
//		ens1.setNom("LERROU");
//		ens1.setPrenom("Pierre");
//		listEnseignant.add(ens1);
		
		req.setAttribute("listEnseignant", listEnseignant);	

		return new ModelAndView("index");
		
	}

}
