package fr.elgregos.java8presentation.lambdas.example2.block;

import java.util.Comparator;
import java.util.function.Function;

public class LambdaSyntax {

	public static void main(String[] args) {
		// Pas de paramètre / Expression simple
		Runnable runnable = () -> System.out.println("New thread");

		// Avec paramètre typé / Bloc d'instruction
		Function<String, String> uppercase = (s) -> {
			return s.toUpperCase();
		};

		// Paramètre sans type (déduit par le compilateur) / Return implicite
		Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
		

		// Paramètre unique sans parenthèse
		Function<String, String> lowercase = s -> s.toLowerCase();
	}

}
