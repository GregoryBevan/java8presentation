## Operations terminales : joining & grouping
<br><br>
Concaténation des éléments avec l'opération joining
```java
String firstNames = roster.stream().map(p -> p.firstName)
                                   .collect(Collectors.joining(", "));
```
<br>
Regroupement des éléments pour constituer une map
```java
Map<Gender, List<Person>> groupedByGender = roster.stream()
                                .collect(Collectors.groupingBy(p -> p.gender));
```
<br><br>