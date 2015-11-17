package fr.elgregos.java8presentation.stream.example07.streamcreation;

import java.util.stream.Stream;

public class EmptyStreamCreationExample {

	public static void main(String... args) {
		Stream<String> empty = Stream.empty();
		empty.forEach(s -> System.out.print("Hello world"));
	}
}
