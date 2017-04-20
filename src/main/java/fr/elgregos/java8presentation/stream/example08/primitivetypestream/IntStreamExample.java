package fr.elgregos.java8presentation.stream.example08.primitivetypestream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String... args) {
		IntStream range = IntStream.range(0, 10);
		IntSummaryStatistics summaryStatistics = range.summaryStatistics();

		System.out.printf("Somme des entiers de 0 � 9 =  %s \n", summaryStatistics.getSum());
		System.out.printf("Moyenne des entiers de 0 � 9 =  %s \n", summaryStatistics.getAverage());
		
		IntStream.rangeClosed(1,10).map(i -> i++).forEach(System.out::println);
	}

}
