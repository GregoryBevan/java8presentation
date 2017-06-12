package fr.elgregos.java8presentation.lambdas.example6.constructorreference;

public class ConstructorReferenceExample {

	public static void main(String... args) {
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David",
				"Guillaume", "Antoine", "Grégory" };
		
		// The constructor reference
// 		TeamBuilder teamBuilder = (names) -> new Team(names);
		TeamBuilder teamBuilder = Team::new;

		Team team = teamBuilder.createTeam(teamFirstName);
		
		displayResult(team);
	}

	private static void displayResult(Team team) {
		// Display team members first name
		team.firstName.forEach(System.out::println);
	}
	
}
