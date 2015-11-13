package fr.elgregos.java8presentation.lambdas.example3.functionalinterface;

public class Calculator {

	public static void main(String... args) {
		// Somme
		Operator sum = (a,b) -> a+b;
		System.out.format("%s + %s = %s \n", 1, 3, sum.apply(1,3));
		
		// Soustraction
		Operator minus = (a,b) -> a-b;
		System.out.format("%s - %s = %s \n", 1, 3, minus.apply(1,3));
		
		// Multiplication
		Operator times = (a,b) -> a*b;
		System.out.format("%s x %s = %s \n", 1, 3, times.apply(1,3));
		
		// Division
		Operator obelus = (a,b) -> a/b;
		Operator modulo = (a,b) -> a%b;
		System.out.format("%s � %s = %s reste %s \n", 1, 3, obelus.apply(1,3), modulo.apply(1, 3));
		
	}
}
