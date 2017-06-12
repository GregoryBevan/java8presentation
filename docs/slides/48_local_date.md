## LocalDate
<br><br>
Construction de date locale
```java
LocalDate now = LocalDate.now();
LocalDate startingDate = LocalDate.of(2017, 06, 19);
LocalDate endingDate = LocalDate.parse("2017-06-19");
```
<br>
Méthodes pour manipuler les dates
```java
LocalDate tomorrow = LocalDate.now().plusDays(1);
DayOfWeek monday = LocalDate.parse("2017-06-19").getDayOfWeek();
boolean leapYear = LocalDate.now().isLeapYear();
boolean notBefore = LocalDate.now().isBefore(LocalDate.parse("2016-06-18"));
```
<br><br>
