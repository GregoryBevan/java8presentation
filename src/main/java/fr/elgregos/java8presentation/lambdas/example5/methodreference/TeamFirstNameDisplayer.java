package fr.elgregos.java8presentation.lambdas.example5.methodreference;

public interface TeamFirstNameDisplayer {

	static void display(String[] teamFirstName) {
		for(int i = 0; i < teamFirstName.length; i++) {
			System.out.format("%s ",teamFirstName[i]);
		}
		System.out.println("\n");
	}
}