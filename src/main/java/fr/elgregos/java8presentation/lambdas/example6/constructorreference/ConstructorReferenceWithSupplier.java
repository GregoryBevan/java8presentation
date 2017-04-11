package fr.elgregos.java8presentation.lambdas.example6.constructorreference;

import java.util.function.Supplier;

public class ConstructorReferenceWithSupplier {

	public static void main(String[] args) {
		Supplier<Team> teamSupplier = () -> new Team(new String[]{"Antoine", "Guillaume", "Fabien"});
		
		Team team = teamSupplier.get();

	}

}
