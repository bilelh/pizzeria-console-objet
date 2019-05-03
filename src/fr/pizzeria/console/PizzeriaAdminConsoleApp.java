package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza [] listPizza = new Pizza[8] ;
		
		listPizza [0] = new Pizza ("PEP" , "pépéroni" , 12.50) ;
		listPizza [1] = new Pizza ("MAR" , "Margherita" , 14.00) ;
		listPizza [2] = new Pizza ("REIN" , "La Reine" , 11.50) ;
		listPizza [3] = new Pizza ("FRC" , "La 4 Fromage" , 12.00) ;
		listPizza [4] = new Pizza ("CAN" , "La Cannibale" , 12.50) ;
		listPizza [5] = new Pizza ("SAV" , "La Savoyarde" , 13.00) ;
		listPizza [6] = new Pizza ("ORI" , "L'Orientale" , 13.50) ;
		listPizza [7] = new Pizza ("IND" , "L'Indienne" , 14.00) ;
		
		
		
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
				System.out.println(listPizza [i].id + " _ " + listPizza [i].code + " -> " + listPizza [i].libelle + " ( " + String.format("%.2f" , listPizza [i].prix) + "€ )");
				
				}
			} else if ( user_choice == 2) {
				System.out.println("Ajout d'une nouvelle pizza  ");
				
				System.out.println("Veuillez saisir le code:  ");
				questionUser.nextLine();
				String newCode = questionUser.nextLine();
				
				System.out.println("Veuillez saisir le nom (sans espace):  ");
				String newLibelle = questionUser.nextLine();
				
				System.out.println("Veuillez saisir le prix (avec une virgule):  ");
				double newPrix = questionUser.nextDouble();
				
				Pizza [] newListPizza = new Pizza[listPizza.length + 1] ;
				
				for (int i = 0 ; i<listPizza.length ; i++) {
					newListPizza[i] = listPizza[i];
				}
				
				newListPizza [newListPizza.length - 1] = new Pizza (newCode , newLibelle , newPrix) ;
				listPizza  = newListPizza  ;
				
				
			} else if ( user_choice == 3) {
				System.out.println("Mise à jour d'une pizza  ");
				
				System.out.println("Veuillez choisir le code de la pizza à modifier:  ");
				questionUser.nextLine();
				String modif_code = questionUser.nextLine();
				
				boolean modif_reussite = false ;
				
				for ( int i = 0 ; i < listPizza.length ; i++ ) {
					if (listPizza [i].code.compareTo(modif_code) == 0) { //pour comparer des String
						
						System.out.println("Veuillez saisir le nouveau code:  ");
						String newCode = questionUser.nextLine();
						
						System.out.println("Veuillez saisir le nouveau nom (sans espace):  ");
						String newLibelle = questionUser.nextLine();
						
						System.out.println("Veuillez saisir le nouveau prix (avec une virgule):  ");
						double newPrix = questionUser.nextDouble();
						
						listPizza [i] = new Pizza(i, newCode , newLibelle , newPrix) ;
						
						modif_reussite = true ;
						
				
					}
				}
				if (modif_reussite) {
					System.out.println("La modification a été prise en compte");
				} else {
					System.out.println("Le code n'existe pas");
				}
				
				
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
