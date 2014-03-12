package com.scrum.evae.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.scrum.evae.dao.RubriqueDAO;
import com.scrum.evae.dao.database.Database;
import com.scrum.evae.metier.model.Rubrique;
import com.scrum.evae.metier.model.RubriqueEvaluation;

public class RubriqueDaoImpl implements RubriqueDAO {

	private Database db;
	//static int cmp = 0;

	public RubriqueDaoImpl() {

	}

	public RubriqueDaoImpl(Database db) {
		super();
		this.db = db;
	}

	public Database getDb() {
		return db;
	}

	public void setDatabase(Database db) {
		this.db = db;
	}

	public List<Rubrique> getRubriques() {
		List<Rubrique> rubriques = new ArrayList<Rubrique>();
		String data[][] = db.selectByOrder("RUBRIQUE","ORDRE");
		    for (int i = 0; i < data.length; i++) {
			Rubrique rubrique = new Rubrique();
			rubrique.setIdRubrique(Integer.parseInt(data[i][0]));
			rubrique.setType(data[i][1]);
			rubrique.setDesignation(data[i][2]);
			rubrique.setOrdre(Integer.parseInt(data[i][3]));
			rubrique.setNoEnseignant(Integer.parseInt(data[i][4]));
			rubriques.add(rubrique);
		}
		return rubriques;
	}


	@Override
	public int ajouterRubriqueEvaluation(int idEvaluation , int idRubrique) {
		String designation=null;
		int ordre=db.getLastOrder("Rubrique_Evaluation");
		int o=ordre++;
		System.out.println("l'ordre est : "+ ordre);
		System.out.println("l'ordre est : "+ o);
		
//    RubriqueEvaluation re = new RubriqueEvaluation(idEvaluation,idRubrique,o);
//  
//    	return db.insert("Rubrique_Evaluation",re);	
    	return db.inserRubriqueEvaluation(idEvaluation,idRubrique,ordre++,designation);	
   
	}
	
	// utilisable pour le prochain sprint
	
	public int ajouterRubriqueEvaluation(int idEvaluation , int idRubrique,String designation) {
		int ordre=db.getLastOrder("Rubrique_Evaluation");
		int o=ordre++;
		System.out.println("l'ordre est : "+ ordre);
		System.out.println("l'ordre est : "+ o);
		
//    RubriqueEvaluation re = new RubriqueEvaluation(idEvaluation,idRubrique,o);
//  
//    	return db.insert("Rubrique_Evaluation",re);	
    	return db.inserRubriqueEvaluation(idEvaluation,idRubrique,ordre++,designation);	
   
	}
		

	@Override
	public boolean retirerRubriqueEvaluation(int idRubriqueEvaluation) {
		db.delete("Rubrique_Evaluation", "idRubriqueEvaluation", Integer.toString(idRubriqueEvaluation));
		
		return false;
	}

	@Override
	public boolean retirerRubriqueEvaluation(int idEvaluation, int idRubrique) {
		// TODO Auto-generated method stub
		return false;
	}


}
