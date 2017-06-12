package fr.elgregos.java8presentation.datetime.example06.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DurationExample {

	public static void main(String[] args) {
		LocalDateTime startingDate = LocalDateTime.of(2017, Month.JULY, 19, 9, 30);
		LocalDateTime endingDate = LocalDateTime.of(2017, Month.JULY, 19, 11, 00);

		Duration talkDuration = Duration.between(startingDate, endingDate);
		long hours = ChronoUnit.HOURS.between(startingDate, endingDate);
		long minutes = ChronoUnit.MINUTES.between(startingDate, endingDate);
		System.out.printf("La présentation dure %d heure et %d minutes ou %d seondes (%s)", hours,
				minutes, talkDuration.getSeconds(), talkDuration);

	}

}
