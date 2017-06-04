package fr.elgregos.java8presentation.datetime.localtime;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		System.out.println("Heure local :  " + LocalTime.now());
		System.out.println("Heure de début de la présentation : " +  LocalTime.of(9, 30));
		System.out.println("Heure de fin de la présentation : " + LocalTime.parse("11:00"));
		
		System.out.println("Dans une heure il sera : " + LocalTime.now().plusHours(1));
		System.out.println("Récupérer les minutes : " + LocalTime.now().getMinute());
		System.out.println("Est-ce que l'heure de fin est dépassée : " + LocalTime.now().isAfter(LocalTime.of(11, 0)));
		System.out.println("L'heure maximale est  : " + LocalTime.MAX);

	}

}
