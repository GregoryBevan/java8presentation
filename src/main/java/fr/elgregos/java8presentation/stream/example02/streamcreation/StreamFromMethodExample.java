package fr.elgregos.java8presentation.stream.example02.streamcreation;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamFromMethodExample {
	
	public static void main(String...args) {
		String phrase = "I need a phrase that I can split into words";
		
		Stream<String> words = Pattern.compile("\\s").splitAsStream(phrase);
		
		words.forEach(System.out::println);
	}

}
