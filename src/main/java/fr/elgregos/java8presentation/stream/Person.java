package fr.elgregos.java8presentation.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class Person {

	public enum Gender {
		MALE, FEMALE;

		public String toLower() {
			return this.name().toLowerCase();
		}
	}

	public String firstName;
	public String lastName;
	public LocalDate birthday;
	public Gender gender;
	private final Set<String> languages;

	public Person(String firstName, String lastName, LocalDate birthday, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.gender = gender;
		this.languages = new HashSet<>();
	}

	public int getAge() {
		return Period.between(birthday, LocalDate.now()).getYears();
	}

	public void add(String language) {
		this.languages.add(language);
	}

	public Set<String> getLanguages() {
		return languages;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday + ", gender="
				+ gender + "]";
	}

}
