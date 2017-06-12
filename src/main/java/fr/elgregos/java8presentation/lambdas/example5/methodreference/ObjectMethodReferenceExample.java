package fr.elgregos.java8presentation.lambdas.example5.methodreference;

import java.util.Arrays;

public class ObjectMethodReferenceExample {

	static class ReverseComparator {
		public int compareTo(String a, String b) {
			return b.compareTo(a);
		}
	}

	public static void main(String... strings) {
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David",
				"Guillaume", "Antoine", "Grégory" };

		TeamFirstNameDisplayer.display(teamFirstName);

		// Appel de la méthode compareTo d'une instance d'objet
		ReverseComparator customStringComparator = new ReverseComparator();
		//Arrays.sort(teamFirstName, (nom1, nom2) -> customStringComparator.compareTo(nom1, nom2));
		Arrays.sort(teamFirstName, customStringComparator::compareTo);

		TeamFirstNameDisplayer.display(teamFirstName);

	}

}
