package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza [] listPizza = new Pizza[8] ;
		
		listPizza [0] = new Pizza (0 ,"PEP" , "pépéroni" , 12.50) ;
		listPizza [1] = new Pizza (1 ,"MAR" , "Margherita" , 14.00) ;
		listPizza [2] = new Pizza (2 ,"REIN" , "La Reine" , 11.50) ;
		listPizza [3] = new Pizza (3, "FRC" , "La 4 Fromage" , 12.00) ;
		listPizza [4] = new Pizza (4 ,"CAN" , "La Cannibale" , 12.50) ;
		listPizza [5] = new Pizza (5 ,"SAV" , "La Savoyarde" , 13.00) ;
		listPizza [6] = new Pizza (6 ,"ORI" , "L'Orientale" , 13.50) ;
		listPizza [7] = new Pizza (7 ,"IND" , "L'Indienne" , 14.00) ;
		
		
		
		Scanner questionUser = new Scanner(System.in);
		//int nombre_1 = questionUser.nextInt();
		
		System.out.println("***** Pizzeria Administration *****  " );
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
				
				for ( int i = 0 ; i < listPizza.length ; i++) {
				System.out.println(listPizza [i].id + " _ " + listPizza [i].code + " -> " + listPizza [i].libelle + " ( " + listPizza [i].prix + " )");
				
				}
			} else if ( user_choice == 2) {
				System.out.println("Ajout d'une nouvelle pizza  ");
				
				System.out.println("Veuillez saisir le code:  ");
				String newCode = questionUser.nextLine();
				
				System.out.println("Veuillez saisir le nom (sans espace):  ");
				String newLibelle = questionUser.nextLine();
				
				System.out.println("Veuillez saisir le prix:  ");
				double newPrix = questionUser.nextDouble();
				
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
