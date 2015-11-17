package fr.elgregos.java8presentation.stream.example03.statefulstreamtransformation;

import java.util.List;
import java.util.Set;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class DistinctExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();

		roster.stream().map(Person::getLanguages).flatMap(Set::stream).distinct().forEach(System.out::println);

	}
}
