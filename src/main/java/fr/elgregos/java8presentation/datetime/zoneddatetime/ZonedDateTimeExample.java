package fr.elgregos.java8presentation.datetime.zoneddatetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		System.out.println("Maintenant : " + ZonedDateTime.now());
		System.out.println("A partir d'une date locale : " + ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris")));
		System.out.println("Date de début de la conférence en UTC : " + ZonedDateTime.parse("2017-06-19T07:30:00Z"));
		
		System.out.println("Maintenant en UTC : " + ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC")));
		System.out.println("Décalage horaire par rapport à UTC : " + ZonedDateTime.now().getOffset());
		System.out.println("Notre zone : " + ZonedDateTime.now().getZone());
	}

}
