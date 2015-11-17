package fr.elgregos.java8presentation.stream.example01.before;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.elgregos.java8presentation.stream.Person;
import fr.elgregos.java8presentation.stream.Person.Gender;
import fr.elgregos.java8presentation.stream.PersonRoster;

public class OldFashionCollectionProcessing {

	public static void main(String... strings) {
		List<Person> roster = PersonRoster.createRoster();

		List<Person> male = new ArrayList<>();
		for (Person person : roster) {
			if (person.gender == Gender.MALE) {
				male.add(person);
			}
		}

		Collections.sort(male, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
		});

		List<String> maleFirstName = new ArrayList<>();
		for (Person person : male) {
			maleFirstName.add(person.firstName);
		}

		for (String firstName : maleFirstName) {
			System.out.println(firstName);
		}
	}

}
