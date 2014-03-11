/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author widad
 */

public class ReponseEvaluation implements Serializable {
    
    private int idReponseEvaluation;
    
    private int idEvaluation;
    
    private String noEtudiantNat;
    
    private String commentaire;
    
    private String nom;
    
    private String prenom;

    public ReponseEvaluation() {
    }

  

    public ReponseEvaluation(int idReponseEvaluation, int idEvaluation,String noEtudiantNat, String commentaire, String nom,String prenom ) {
        this.idReponseEvaluation = idReponseEvaluation;
        this.idEvaluation = idEvaluation;
        this.noEtudiantNat = noEtudiantNat;
        this.commentaire = commentaire;
        this.nom = nom;
        this.prenom = prenom;
 
        
    }

   

       public int getIdReponseEvaluation() {
        return idReponseEvaluation;
    }

    public void setIdReponseEvaluation(int idReponseEvaluation) {
        this.idReponseEvaluation = idReponseEvaluation;
    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Override
    public String toString() {
        return "Enseignant.Gestionnaire.ReponseEvaluation[ idReponseEvaluation=" + idReponseEvaluation + ", idEvaluation=" + idEvaluation + " ]";
    
}
}