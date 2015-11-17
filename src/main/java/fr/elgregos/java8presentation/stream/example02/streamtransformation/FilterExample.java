package fr.elgregos.java8presentation.stream.example02.streamtransformation;

import java.util.List;
import java.util.function.Predicate;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class FilterExample {
	
	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();
		
		// Filtrer selon une expression lambda
		System.out.println("Adult person");
		roster.stream().filter(p -> p.getAge() > 18).forEach(System.out::println);
		
		// Filtrer selon une méthode statique
		System.out.println("\nChild person");
		roster.stream().filter(FilterExample::isChild).forEach(System.out::println);
		
		// Filtrer selon une méthode retournant un prédicat 
		System.out.println("\nJ person");
		roster.stream().filter(firstNamePredicate()).forEach(System.out::println);
	}
	

	private static boolean isChild(Person p) {
		return p.getAge() <18;
	}
	
	
	private static Predicate<Person> firstNamePredicate() {
		return p -> p.firstName.startsWith("J");
	}

}
