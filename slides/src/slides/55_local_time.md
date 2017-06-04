## LocalTime
<br><br>
Construction d'heure locale
```java
LocalTime localTime = LocalTime.now();
LocalTime localTime = LocalTime.of(9, 30);
LocalTime localTime = LocalTime.parse("09:30");
```
Méthodes pour manipuler les dates
```java
LocalTime oneHourLater = LocalTime.now().plusHours(1);
int minutes = LocalTime.now().getMinute();
boolean isAfter = LocalTime.now().isAfter(LocalTime.of(11, 0);
LocalTime max = LocalDate.parse("2017-06-19").isBefore(LocalDate.parse("2016-06-18"))
```
<br><br>
