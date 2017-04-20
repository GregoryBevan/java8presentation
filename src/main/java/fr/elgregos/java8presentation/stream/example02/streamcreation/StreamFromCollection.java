package fr.elgregos.java8presentation.stream.example02.streamcreation;

import java.util.Arrays;
import java.util.List;

public class StreamFromCollection {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(new String[] { "Magali", "Medy", "Thomas", "Dany", "Ga�tan", "Arnaud", "David",
				"Guillaume", "Antoine", "Gr�gory" });
		names.stream().forEach(System.out::println);;

	}

}
