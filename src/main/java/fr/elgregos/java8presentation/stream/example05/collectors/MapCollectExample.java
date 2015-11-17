package fr.elgregos.java8presentation.stream.example05.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class MapCollectExample {

	public static void main(String...args) {
		List<Person> roster = PersonRoster.createRoster();
		
		Map<String, Person> rosterAsMap = roster.stream().collect(Collectors.toMap(p->p.firstName.toLowerCase(), Function.identity()));
		
		Person john = rosterAsMap.get("john");
		
		System.out.printf("John identity : %s", john);
		
	}
}
