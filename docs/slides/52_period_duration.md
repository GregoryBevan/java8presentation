## Period & Duration
<br><br>
Gérer des périodes
```java
LocalDate manufacturingDate = LocalDate.of(2017, Month.JANUARY, 1);
LocalDate expiryDate = LocalDate.of(2017, Month.JUNE, 20);

Period expiry = Period.between(manufacturingDate, expiryDate);
int numberOfDays = expiry.getDays();
```
<br>
Gérer des durées
```java
LocalDateTime startingDate = LocalDateTime.of(2017, Month.JULY, 19, 9, 30);
LocalDateTime endingDate = LocalDateTime.of(2017, Month.JULY, 19, 11, 00);

Duration talkDuration = Duration.between(startingDate, endingDate);
long hours = ChronoUnit.HOURS.between(startingDate, endingDate);
long minutes = ChronoUnit.MINUTES.between(startingDate, endingDate);
```
<br><br>