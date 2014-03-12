package com.scrum.evae.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.scrum.evae.dao.EvaluationDAO;
import com.scrum.evae.dao.database.Database;
import com.scrum.evae.metier.model.Evaluation;

public class EvaluationDaoImpl extends JdbcDaoSupport  implements EvaluationDAO {
	private Database db;
	
	public EvaluationDaoImpl() {
		
	}
	public EvaluationDaoImpl(Database db) {
		super();
		this.db = db;
	}
	
	public Database getDb() {
		return db;
	}
	public void setDatabase(Database db) {
		this.db = db;
	}

	@Override
	public List<Evaluation> getEvalsEnseigant(int numEnseignant) {
		List<Evaluation> evaluations = new ArrayList<Evaluation>();
		String data[][] = db.select2("EVALUATION","no_enseignant", numEnseignant);
		for (int i = 0; i < data.length; i++) {
			Evaluation evaluation=new Evaluation();
			evaluation.setNoEvaluation(Integer.parseInt(data[i][0]));
			evaluation.setNoEnseignant(Integer.parseInt(data[i][1]));
			evaluation.setCodeFormation(data[i][2]);
			evaluation.setAnneePro(data[i][3]);
			evaluation.setCodeUe(data[i][4]);
			evaluation.setCodeEc(data[i][5]);
			evaluation.setNoEvaluation(Integer.parseInt(data[i][6]));
			evaluation.setEtat(data[i][7]);
			evaluation.setPeriode(data[i][8]);
			
			String dDebut = data[i][9];
			SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
			Date dateDebut;
			try {
				dateDebut = sdf.parse(dDebut);
				evaluation.setDebutReponse(dateDebut);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			String dFin = data[i][9];
			Date dateFin;
			try {
				dateFin = sdf.parse(dFin);
				evaluation.setFinReponse(dateFin);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			evaluation.setDesignation(data[i][11]);
			evaluations.add(evaluation);
		}
		return evaluations;
	
	}

	public int creerEvaluation(Evaluation evaluation) {
		  return db.insert(evaluation);
	}

	@Override
	public Evaluation modifierEvaluation(Evaluation evaluation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteEvaluation(int idEvaluation) {
		// TODO Auto-generated method stub
		return false;
	}

}
