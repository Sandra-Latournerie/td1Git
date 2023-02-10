package com.inti.models;

import java.util.Date;



public class Compte {
	

	
	private long idCompte;
	private Date dateCreation;
	private double solde;
	
	
	
	public Compte() {
	}
	
	public long getIdCompte() {
		return idCompte;
	}
	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
}
