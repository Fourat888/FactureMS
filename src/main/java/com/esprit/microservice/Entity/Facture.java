package com.esprit.microservice.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFacture;
	private String nom;
    private String commande;
    private String description;
	private String Date;
	private String etat;



public Facture(){
	
	super();
	
}










public Facture(String nom) {
	super();
	this.nom = nom;
}










public Facture(int idFacture, String nom, String commande, String description, String Date, String etat) {
	super();
	this.idFacture = idFacture;
	this.nom = nom;
	this.commande = commande;
	this.description = description;
	this.etat = etat;
	this.Date = Date;

}

	public int getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCommande() {
		return commande;
	}

	public void setCommande(String commande) {
		this.commande = commande;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
}
