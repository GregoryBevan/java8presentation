package fr.elgregos.java8presentation.stream.example06.extractionconcatenation;

import java.util.stream.Stream;

public class ExtractionAndConcatenationExample {
	
	public static void main(String... args) {
		Stream<Integer> firstStream = Stream.iterate(0, i -> ++i).limit(10);
		Stream<Integer> secondStream = Stream.iterate(0, i -> ++i).skip(20).limit(10);
		
		Stream.concat(firstStream, secondStream).forEach(System.out::println);;
	}
}
