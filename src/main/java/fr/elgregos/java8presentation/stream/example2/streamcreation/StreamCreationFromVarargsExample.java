package fr.elgregos.java8presentation.stream.example2.streamcreation;

import java.util.stream.Stream;

public class StreamCreationFromVarargsExample {

	public static void main(String...args) {		
		Stream.of( "Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David",
				"Guillaume", "Antoine", "Gr�gory").forEach(System.out::println);
	}
}
