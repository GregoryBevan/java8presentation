package fr.elgregos.java8presentation.stream.example02.streamcreation;

import java.util.stream.Stream;

public class StreamFromArrayExample {

	public static void main(String...args) {	
		String[] teamFirstName = new String[] { "Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David",
				"Guillaume", "Antoine", "Gr�gory" };
		
		Stream.of(teamFirstName).forEach(System.out::println);
	}
}
