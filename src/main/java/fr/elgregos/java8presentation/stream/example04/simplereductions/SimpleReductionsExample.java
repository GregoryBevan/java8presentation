package fr.elgregos.java8presentation.stream.example04.simplereductions;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class SimpleReductionsExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();
		
		long numberOfChildren = roster.stream().filter(p -> p.getAge() < 18).count();
		System.out.printf("the roster contains %s children \n\n", numberOfChildren);
		
		Optional<Person> mostPolyglot = roster.stream().max(Comparator.comparing(p -> p.getLanguages().size()));
		System.out.printf("The most polyglot person is  : %s", mostPolyglot.get());
	}
}
