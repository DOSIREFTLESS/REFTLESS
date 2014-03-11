/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.scrum.evae.metier.model;


import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Amina LAARIM
 * 
 */
public class Etudiant implements Serializable {
    private static final long serialVersionUID = 1L;
    private String noEtudiantNat;
    private String anneePro;
    private String codeCom;
    private String noEtudiantUbo;
    private String sexe;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String lieuNaissance;
    private String situation;
    private String nationalite;
    private String telPort;
    private String telFixe;
    private String email;
    private String actuAdresse;
    private String actuCp;
    private String actuVille;
    private String actuPays;
    private String permAdresse;
    private String permCp;
    private String permVille;
    private String permPays;
    private String dernierDiplome;
    private String universite;
    private String sigleEtu;
    private String compteCri;
    private String uboEmail;
    private Integer grpeAnglais;
    private String abandonMotif;
    private Date abandonDate;
    private Character estDiplome;

    public Etudiant() {
    }

    public Etudiant(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public Etudiant(String noEtudiantNat, String anneePro, String sexe, String nom, String prenom, Date dateNaissance, String lieuNaissance, String situation, String nationalite, String permAdresse, String permCp, String permVille, String permPays, String dernierDiplome, String universite, String sigleEtu, String compteCri) {
        this.noEtudiantNat = noEtudiantNat;
        this.anneePro = anneePro;
        this.sexe = sexe;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.situation = situation;
        this.nationalite = nationalite;
        this.permAdresse = permAdresse;
        this.permCp = permCp;
        this.permVille = permVille;
        this.permPays = permPays;
        this.dernierDiplome = dernierDiplome;
        this.universite = universite;
        this.sigleEtu = sigleEtu;
        this.compteCri = compteCri;
    }

    public String getNoEtudiantNat() {
        return noEtudiantNat;
    }

    public void setNoEtudiantNat(String noEtudiantNat) {
        this.noEtudiantNat = noEtudiantNat;
    }

    public String getAnneePro() {
        return anneePro;
    }

    public void setAnneePro(String anneePro) {
        this.anneePro = anneePro;
    }

    public String getCodeCom() {
        return codeCom;
    }

    public void setCodeCom(String codeCom) {
        this.codeCom = codeCom;
    }

    public String getNoEtudiantUbo() {
        return noEtudiantUbo;
    }

    public void setNoEtudiantUbo(String noEtudiantUbo) {
        this.noEtudiantUbo = noEtudiantUbo;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
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

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(String lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActuAdresse() {
        return actuAdresse;
    }

    public void setActuAdresse(String actuAdresse) {
        this.actuAdresse = actuAdresse;
    }

    public String getActuCp() {
        return actuCp;
    }

    public void setActuCp(String actuCp) {
        this.actuCp = actuCp;
    }

    public String getActuVille() {
        return actuVille;
    }

    public void setActuVille(String actuVille) {
        this.actuVille = actuVille;
    }

    public String getActuPays() {
        return actuPays;
    }

    public void setActuPays(String actuPays) {
        this.actuPays = actuPays;
    }

    public String getPermAdresse() {
        return permAdresse;
    }

    public void setPermAdresse(String permAdresse) {
        this.permAdresse = permAdresse;
    }

    public String getPermCp() {
        return permCp;
    }

    public void setPermCp(String permCp) {
        this.permCp = permCp;
    }

    public String getPermVille() {
        return permVille;
    }

    public void setPermVille(String permVille) {
        this.permVille = permVille;
    }

    public String getPermPays() {
        return permPays;
    }

    public void setPermPays(String permPays) {
        this.permPays = permPays;
    }

    public String getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(String dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getSigleEtu() {
        return sigleEtu;
    }

    public void setSigleEtu(String sigleEtu) {
        this.sigleEtu = sigleEtu;
    }

    public String getCompteCri() {
        return compteCri;
    }

    public void setCompteCri(String compteCri) {
        this.compteCri = compteCri;
    }

    public String getUboEmail() {
        return uboEmail;
    }

    public void setUboEmail(String uboEmail) {
        this.uboEmail = uboEmail;
    }

    public Integer getGrpeAnglais() {
        return grpeAnglais;
    }

    public void setGrpeAnglais(Integer grpeAnglais) {
        this.grpeAnglais = grpeAnglais;
    }

    public String getAbandonMotif() {
        return abandonMotif;
    }

    public void setAbandonMotif(String abandonMotif) {
        this.abandonMotif = abandonMotif;
    }

    public Date getAbandonDate() {
        return abandonDate;
    }

    public void setAbandonDate(Date abandonDate) {
        this.abandonDate = abandonDate;
    }

    public Character getEstDiplome() {
        return estDiplome;
    }

    public void setEstDiplome(Character estDiplome) {
        this.estDiplome = estDiplome;
    }
    
    public String toString() {
        return "reftlesssoft.Etudiant[ noEtudiantNat=" + noEtudiantNat + " ]";
    }
    
}
