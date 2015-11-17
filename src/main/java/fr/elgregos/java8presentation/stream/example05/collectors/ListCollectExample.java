package fr.elgregos.java8presentation.stream.example05.collectors;

import java.util.List;
import java.util.stream.Collectors;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class ListCollectExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();
		
		List<Person> collect = roster.stream().filter(p -> p.getAge() < 18).collect(Collectors.toList());
		collect.forEach(System.out::println);

	}
}
