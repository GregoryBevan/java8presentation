package fr.elgregos.java8presentation.stream.example03.statefulstreamtransformation;

import java.util.Comparator;
import java.util.List;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class SortStreamExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();
		
		roster.stream().sorted(Comparator.comparing(p -> p.firstName)).forEach(System.out::println);
	}
}
