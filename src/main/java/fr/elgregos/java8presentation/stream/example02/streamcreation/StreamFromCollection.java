package fr.elgregos.java8presentation.stream.example02.streamcreation;

import java.util.Arrays;
import java.util.List;

public class StreamFromCollection {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Magali", "Medy", "Thomas", "Dany", "Gaëtan", "Arnaud", "David",
				"Guillaume", "Antoine", "Grégory" );
		names.stream().forEach(System.out::println);;

	}

}
