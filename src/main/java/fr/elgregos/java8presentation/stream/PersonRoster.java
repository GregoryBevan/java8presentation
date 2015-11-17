package fr.elgregos.java8presentation.stream;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

import fr.elgregos.java8presentation.stream.Person.Gender;

public class PersonRoster {

	public static List<Person> roster = new ArrayList<>();

	public static List<Person> createRoster() {
		Person person1 = new Person("John", "Doe", IsoChronology.INSTANCE.date(1970, 1, 1), Gender.MALE);
		person1.add("English");
		roster.add(person1);
		Person person2 = new Person("Scott", "Tiger", IsoChronology.INSTANCE.date(1990, 7, 15), Gender.MALE);
		person2.add("English");
		person2.add("French");
		person2.add("Swedish");
		roster.add(person2);
		Person person3 = new Person("Peter", "Lumberjack", IsoChronology.INSTANCE.date(1991, 8, 13), Gender.MALE);
		person3.add("English");
		person3.add("Spanish");
		roster.add(person3);
		Person person4 = new Person("Bob", "Sommerfield", IsoChronology.INSTANCE.date(2000, 9, 12), Gender.MALE);
		person4.add("English");
		roster.add(person4);
		Person person5 = new Person("Suzy", "Leghorn", IsoChronology.INSTANCE.date(1977, 5, 6), Gender.FEMALE);
		person5.add("English");
		person5.add("French");
		roster.add(person5);
		Person person6 = new Person("Daisy", "Allgood", IsoChronology.INSTANCE.date(1988, 2, 21), Gender.FEMALE);
		person6.add("English");
		roster.add(person6);
		Person person7 = new Person("Jane", "Doe", IsoChronology.INSTANCE.date(1951, 5, 24), Gender.FEMALE);
		person7.add("French");
		roster.add(person7);
		Person person8 = new Person("Billy", "Rivers", IsoChronology.INSTANCE.date(1968, 5, 15), Gender.MALE);
		person8.add("English");
		person8.add("Spanish");
		roster.add(person8);
		Person person9 = new Person("Charles", "Selwyn", IsoChronology.INSTANCE.date(2005, 9, 12), Gender.MALE);
		person9.add("English");
		roster.add(person9);
		return roster;
	}

}
