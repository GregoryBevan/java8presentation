package fr.elgregos.java8presentation.lambdas.example5.methodreference;

import java.util.Arrays;

public class StaticMethodReference {

	public static void main(String... strings) {
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David",
				"Guillaume", "Antoine", "Grégory" };

		TeamFirstNameDisplayer.display(teamFirstName);

		// Appel de la méthode statique compareLength
		Arrays.sort(teamFirstName, StaticMethodReference::compareLength);

		TeamFirstNameDisplayer.display(teamFirstName);

	}

	public static int compareLength(String a, String b) {
		return Integer.compare(a.length(), b.length());
	}

}
