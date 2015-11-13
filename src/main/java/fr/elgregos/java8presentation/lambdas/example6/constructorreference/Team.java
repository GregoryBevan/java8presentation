package fr.elgregos.java8presentation.lambdas.example6.constructorreference;

import java.util.Arrays;
import java.util.List;

public class Team {
	
	public List<String> firstName;
	
	public Team(final String[] firstName) {
		this.firstName = Arrays.asList(firstName);
	}

}
