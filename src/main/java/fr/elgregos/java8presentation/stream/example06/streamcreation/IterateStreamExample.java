package fr.elgregos.java8presentation.stream.example06.streamcreation;

import java.util.stream.Stream;

public class IterateStreamExample {

	public static void main(String... args) {
		Stream<Short> iterateStream = Stream.iterate(Short.MIN_VALUE, n -> ++n);
		iterateStream.forEach(System.out::println);
	}

}
