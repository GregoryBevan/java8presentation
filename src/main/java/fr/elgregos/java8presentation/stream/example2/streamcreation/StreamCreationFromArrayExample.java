package fr.elgregos.java8presentation.stream.example2.streamcreation;

import java.util.stream.Stream;

public class StreamCreationFromArrayExample {

	public static void main(String...args) {	
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David",
				"Guillaume", "Antoine", "Grégory" };
		
		Stream.of(teamFirstName).forEach(System.out::println);
	}
}
