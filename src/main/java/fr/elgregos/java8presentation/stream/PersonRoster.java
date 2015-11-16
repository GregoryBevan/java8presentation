package fr.elgregos.java8presentation.stream;

import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

import fr.elgregos.java8presentation.stream.Person.Sex;

public class PersonRoster {

	public static List<Person> roster = new ArrayList<>();

	public static List<Person> createRoster() {
		roster.add(new Person("John", "Doe", IsoChronology.INSTANCE.date(1970, 1, 1), Sex.MALE));
		roster.add(new Person("Scott", "Tiger", IsoChronology.INSTANCE.date(1990, 7, 15), Sex.MALE));
		roster.add(new Person("Peter", "Lumberjack", IsoChronology.INSTANCE.date(1991, 8, 13), Sex.MALE));
		roster.add(new Person("Bob", "Sommerfield", IsoChronology.INSTANCE.date(2000, 9, 12), Sex.MALE));
		roster.add(new Person("Suzy", "Leghorn", IsoChronology.INSTANCE.date(1977, 5, 6), Sex.FEMALE));
		roster.add(new Person("Daisy", "Allgood", IsoChronology.INSTANCE.date(1988, 2, 21), Sex.FEMALE));
		roster.add(new Person("Jane", "Doe", IsoChronology.INSTANCE.date(1951, 5, 24), Sex.FEMALE));
		roster.add(new Person("Billy", "Rivers", IsoChronology.INSTANCE.date(1968, 5, 15), Sex.MALE));
		roster.add(new Person("Charles", "Selwyn", IsoChronology.INSTANCE.date(2005, 9, 12), Sex.MALE));
		return roster;
	}

}
