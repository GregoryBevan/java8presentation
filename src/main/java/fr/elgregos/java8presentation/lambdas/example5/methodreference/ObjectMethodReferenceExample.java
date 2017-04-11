package fr.elgregos.java8presentation.lambdas.example5.methodreference;

import java.util.Arrays;

public class ObjectMethodReferenceExample {

	static class ReverseComparator {
		public int compareTo(String a, String b) {
			return b.compareTo(a);
		}
	}

	public static void main(String... strings) {
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David",
				"Guillaume", "Antoine", "Gr�gory" };

		TeamFirstNameDisplayer.display(teamFirstName);

		// Appel de la m�thode compareTo d'une instance d'objet
		ReverseComparator customStringComparator = new ReverseComparator();
		//Arrays.sort(teamFirstName, (nom1, nom2) -> customStringComparator.compareTo(nom1, nom2));
		Arrays.sort(teamFirstName, customStringComparator::compareTo);

		TeamFirstNameDisplayer.display(teamFirstName);

	}

}
