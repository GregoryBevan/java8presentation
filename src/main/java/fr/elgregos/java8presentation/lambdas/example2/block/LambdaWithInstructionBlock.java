package fr.elgregos.java8presentation.lambdas.example2.block;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaWithInstructionBlock {
	
	public static void main(String... args) {
		
		// Bloc d'instruction
		Comparator<String> stringLengthComparator = (s1, s2) -> {
			int compareTo = Integer.compare(s1.length(), s2.length());
			System.out.format("Compare \"%s\" et \"%s\" : %s \n", s1, s2, compareTo);			
			return compareTo;
		};
		
		// Usage
		String[] numbers = new String[] {"un", "deux", "trois", "quatre", "cinq"};
		Arrays.sort(numbers, stringLengthComparator);
				
		System.out.println();
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
