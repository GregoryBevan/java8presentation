package fr.elgregos.java8presentation.lambdas.example5.methodreference;

import java.util.Arrays;

public class StaticMethodReference {

	public static void main(String... strings) {
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David",
				"Guillaume", "Antoine", "Gr�gory" };

		TeamFirstNameDisplayer.display(teamFirstName);

		// Appel de la m�thode static compareLength
		Arrays.sort(teamFirstName, StaticMethodReference::compareLength);

		TeamFirstNameDisplayer.display(teamFirstName);

	}

	public static int compareLength(String a, String b) {
		return Integer.compare(a.length(), b.length());
	}

}
