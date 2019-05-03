package fr.pizzeria.console;

import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		if (user_choice == 1) {
			System.out.println("Liste des pizzas  ");
		} else if ( user_choice == 2) {
			System.out.println("Ajout d'une nouvelle pizza  ");
		} else if ( user_choice == 3) {
			System.out.println("Mise à jour d'une pizza  ");
		} else if ( user_choice == 4) {
			System.out.println("Suppression d'une pizza ");
		} else if ( user_choice == 99) {
			System.out.println("Aurevoir :(  ");
		}
		
		
		
		

	}

}
