package fr.elgregos.java8presentation.stream.example05.collectors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class SetAndJoiningCollectExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();

		Set<String> spokenLanguages = roster.stream()
				.map(Person::getLanguages)
				.flatMap(Set::stream)
				.distinct()
				.collect(Collectors.toSet());		
		
		String firstNames = roster.stream().map(p -> p.firstName).collect(Collectors.joining(", "));
		System.out.println(firstNames);
		System.out.printf("Spoken languages : %s", spokenLanguages.stream().collect(Collectors.joining(", ")));

	}

}
