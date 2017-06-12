package fr.elgregos.java8presentation.lambdas.example5.methodreference;

import java.util.Arrays;

public class ClassMethodReferenceExample {

	public static void main(String... args) {
		String[] teamFirstName = new String []{"Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David", "Guillaume", "Antoine", "Grégory"};
				
		TeamFirstNameDisplayer.display(teamFirstName);
		
		// Appel de la méthode compareTo de la classe String

//		 Arrays.sort(teamFirstName, (nom1, nom2) -> nom1.compareTo(nom2));
		Arrays.sort(teamFirstName, String::compareTo);
		
		TeamFirstNameDisplayer.display(teamFirstName);
		
	}
}
