## LocalTime
<br><br>
Construction d'heure locale
```java
LocalTime now = LocalTime.now();
LocalTime startingTime = LocalTime.of(9, 30);
LocalTime endingTime = LocalTime.parse("09:30");
```
<br>
Méthodes pour manipuler les heures locales
```java
LocalTime oneHourLater = LocalTime.now().plusHours(1);
int minutes = LocalTime.now().getMinute();
boolean isAfter = LocalTime.now().isAfter(LocalTime.of(11, 0);
LocalTime max = LocalTime.MAX;
```
<br><br>
