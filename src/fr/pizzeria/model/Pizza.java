package fr.pizzeria.model;

public class Pizza {
	
	int id ;
	String code ;
	String libelle ;
	double prix ;
	
	public Pizza (String code , String libelle , double prix) {
		this.code = code ;
		this.libelle = libelle ;
		this.prix = prix ;
	}

}
