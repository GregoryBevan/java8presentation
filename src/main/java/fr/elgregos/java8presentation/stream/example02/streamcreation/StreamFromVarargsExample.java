package fr.elgregos.java8presentation.stream.example02.streamcreation;

import java.util.stream.Stream;

public class StreamFromVarargsExample {

	public static void main(String... args) {		
		Stream.of( "Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David",
				"Guillaume", "Antoine", "Grégory").forEach(System.out::println);
	}
}
