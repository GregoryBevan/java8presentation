package fr.elgregos.java8presentation.datetime.instant;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {

	public static void main(String[] args) {
		Instant now = Instant.now();
		
		System.out.println("Timestamp : " + now);
		System.out.println("Nombre de secondes depuis EPOCH : " + now.getEpochSecond());
		System.out.println("Nombre d'heures avant la fin du temps machine : " + now.until(Instant.MAX, ChronoUnit.HOURS));
	}
}
