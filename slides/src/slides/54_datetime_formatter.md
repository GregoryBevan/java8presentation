## Formater les dates et heures
<br><br>
<div>`java.time.format.DateTimeFormatter` permet de convertir les dates :
- transformer un objet date en chaine de caractères : `format()`
- parser une chaine de caractères en date : `parse()`
</div>
<br><br>
```java
LocalDate date = LocalDate.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
String text = date.format(formatter);
```
```java
String input = "2016 03 17";
LocalDate parsedDate = LocalDate.parse(input, formatter);
```
<br><br>