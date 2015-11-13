package fr.elgregos.java8presentation.lambdas.example6.constructorreference;

public class ConstructorReferenceExample {

	public static void main(String... args) {
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David",
				"Guillaume", "Antoine", "Gr�gory" };
		
		// The constructor reference
		TeamBuilder teamBuilder = Team::new;

		Team team = teamBuilder.createTeam(teamFirstName);
		
		// Display team members first name
		team.firstName.forEach(System.out::println);
	}

}
