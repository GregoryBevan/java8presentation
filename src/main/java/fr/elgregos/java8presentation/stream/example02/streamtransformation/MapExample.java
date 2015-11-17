package fr.elgregos.java8presentation.stream.example02.streamtransformation;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Function;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class MapExample {

	public static void main(String... args) {
		List<Person> roster = PersonRoster.createRoster();
		
		System.out.println("Person full name");
		roster.stream().map(p -> p.firstName + " " + p.lastName).forEach(System.out::println);
		
		System.out.println("\nPerson birthday");
		roster.stream().map(birthdayFunction()).forEach(System.out::println);
		
		System.out.println("\nPerson gender");
		roster.stream().map(MapExample::getPersonGender).forEach(System.out::println);
	}
	
	private static Function<Person, LocalDate> birthdayFunction() {
		return p -> p.birthday;
	}
	
	private static String getPersonGender(Person person) {
		return person.firstName + " is a " + person.gender.toLower();
	}

}
