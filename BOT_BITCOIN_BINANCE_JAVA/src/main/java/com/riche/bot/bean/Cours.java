package com.riche.bot.bean;

import java.util.Date;

public class Cours {
	
	 private int id;
	 private String symbol;
	 private int volume;
	 private double prix;
	 private Date dateEnregistrement;
	 
	  // ===========================
	 // GETTERS ET SETTERS
 	// ===========================
	 
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public Date getDateEnregistrement() {
		return dateEnregistrement;
	}
	public void setDateEnregistrement(Date dateEnregistrement) {
		this.dateEnregistrement = dateEnregistrement;
	}
	
	  
}
