## LocalDateTime
<br><br>
Construction de date et heure locale
```java
LocalDateTime now = LocalDateTime.now()
LocalDateTime startingDateTime = LocalDateTime.of(2017, Month.JUNE, 19, 9, 30);
LocalDateTime endingDateTime = LocalDateTime.parse("2017-06-19T11:00");
```
<br>
Méthodes pour manipuler les dates et heures locales
```java
LocalDateTime nextSession = LocalDateTime.of(2017, 06, 19, 9, 30)
                                         .plusDays(1).plusMinutes(30);
LocalDateTime firstDayOfNextMonth = LocalDateTime.now().with(TemporalAdjusters
                                                .firstDayOfNextMonth());
LocalDateTime min = LocalDateTime.MIN;
LocalDateTime max = LocalDateTime.MAX;
```
<br><br>