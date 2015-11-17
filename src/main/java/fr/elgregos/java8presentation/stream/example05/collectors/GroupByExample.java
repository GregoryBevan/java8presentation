package fr.elgregos.java8presentation.stream.example05.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class GroupByExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();
		
		Map<String, List<Person>> groupedPerson = roster.stream().collect(Collectors.groupingBy(p -> {
			if(p.getAge() < 18) {
				return "child";
			} else {
				return "adult";
			}
		}));

		
		groupedPerson.get("child").forEach(System.out::println);
	}
}
