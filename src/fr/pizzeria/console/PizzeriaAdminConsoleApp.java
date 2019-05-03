package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza a = new Pizza (0 ,"PEP" , "pépéroni" , 12.50) ;
		Pizza b = new Pizza (1 ,"MAR" , "Margherita" , 14.00) ;
		Pizza c = new Pizza (2 ,"REIN" , "La Reine" , 11.50) ;
		Pizza d = new Pizza (3, "FRC" , "La 4 Fromage" , 12.00) ;
		Pizza e = new Pizza (4 ,"CAN" , "La Cannibale" , 12.50) ;
		Pizza f = new Pizza (5 ,"SAV" , "La Savoyarde" , 13.00) ;
		Pizza g = new Pizza (6 ,"ORI" , "L'Orientale" , 13.50) ;
		Pizza h = new Pizza (7 ,"IND" , "L'Indienne" , 14.00) ;
		System.out.println(a.code + " -> " + a.libelle + " ( " + a.prix + " )");
		System.out.println(b.code + " -> " + b.libelle + " ( " + b.prix + " )");
		System.out.println(c.code + " -> " + c.libelle + " ( " + c.prix + " )");
		System.out.println(d.code + " -> " + d.libelle + " ( " + d.prix + " )");
		System.out.println(e.code + " -> " + e.libelle + " ( " + e.prix + " )");
		System.out.println(f.code + " -> " + f.libelle + " ( " + f.prix + " )");
		System.out.println(g.code + " -> " + g.libelle + " ( " + g.prix + " )");
		System.out.println(h.code + " -> " + h.libelle + " ( " + h.prix + " )");
		
		
		Scanner questionUser = new Scanner(System.in);
		//int nombre_1 = questionUser.nextInt();
		
		System.out.println("***** Pizzeria Administration *****  ");
		System.out.println("1. Lister les pizzas  ");
		System.out.println("2. Ajouter une nouvelle pizza  ");
		System.out.println("3. Mettre à jour une pizza  ");
		System.out.println("4. Supprimer une pizza  ");
		System.out.println("99. Sortir  ");
		
		System.out.println("Veuillez faire votre choix");
		int user_choice = questionUser.nextInt();
		
		while (user_choice != 99) {
		
		
			if (user_choice == 1) {
				System.out.println("Liste des pizzas  ");
			} else if ( user_choice == 2) {
				System.out.println("Ajout d'une nouvelle pizza  ");
			} else if ( user_choice == 3) {
				System.out.println("Mise à jour d'une pizza  ");
			} else if ( user_choice == 4) {
				System.out.println("Suppression d'une pizza ");
			} else {
				System.out.println("Je n'ai pas compris, Veuillez recommencer1 ");
			}
			
			System.out.println("***** Pizzeria Administration *****  ");
			System.out.println("1. Lister les pizzas  ");
			System.out.println("2. Ajouter une nouvelle pizza  ");
			System.out.println("3. Mettre à jour une pizza  ");
			System.out.println("4. Supprimer une pizza  ");
			System.out.println("99. Sortir  ");
			
			System.out.println("Veuillez faire votre choix");
			user_choice = questionUser.nextInt();
			
			
		
		}
		System.out.println("Aurevoir :(  ");
		

	}

}
