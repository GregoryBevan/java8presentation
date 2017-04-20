package fr.elgregos.java8presentation.stream.example02.streamcreation;

import java.util.stream.Stream;

public class GeneratedStreamExample {

	public static void main(String... args) {
		Stream<String> constantStream = Stream.generate(() -> "echo");
		
		Stream<Double> randoms = Stream.generate(Math::random);
		
		constantStream.forEach(System.out::println);
//		randoms.forEach(System.out::println);
	}
}
