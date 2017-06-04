## LocalDateTime
<br><br>
Construction de date locale
```java
LocalDate localDate = LocalDate.now();
LocalDate localDate = LocalDate.of(2017, 06, 19);
LocalDate localDate = LocalDate.parse("2017-06-19");
```
Méthodes pour manipuler les dates
```java
LocalDate tomorrow = LocalDate.now().plusDays(1);
DayOfWeek monday = LocalDate.parse("2017-06-19").getDayOfWeek();
boolean leapYear = LocalDate.now().isLeapYear();
boolean notBefore = LocalDate.parse("2017-06-19").isBefore(LocalDate.parse("2016-06-18"))
```
<br><br>