package fr.elgregos.java8presentation.stream.example01.after;

import java.util.List;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;
import fr.elgregos.java8presentation.stream.Person.Gender;

public class UseStreamForCollectionProcessing {

	public static void main(String... strings) {
		List<Person> roster = PersonRoster.createRoster();

		roster.stream()
				.filter(p -> p.gender == Gender.MALE)
				.sorted((p1, p2) -> p1.getAge() - p2.getAge())
				.map(p -> p.firstName)
				.forEach(System.out::println);
	}

}
