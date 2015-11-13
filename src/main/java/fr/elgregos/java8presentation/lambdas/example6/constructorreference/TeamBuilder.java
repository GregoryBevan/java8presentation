package fr.elgregos.java8presentation.lambdas.example6.constructorreference;

@FunctionalInterface
public interface TeamBuilder {

	Team createTeam(String[] teamFirstName);
}
