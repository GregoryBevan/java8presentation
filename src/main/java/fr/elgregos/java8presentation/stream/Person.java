package fr.elgregos.java8presentation.stream;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	
	public enum Sex {
		MALE,
		FEMALE
	}

	public String firstName;
	public String lastName;
	public LocalDate birthday;
	public Sex sex;
	
	public Person(String firstName, String lastName, LocalDate birthday, Sex sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.sex = sex;
	}

	public int getAge() {
		return Period.between(birthday, LocalDate.now()).getYears();
	}

}
