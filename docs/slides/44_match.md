## Operations terminales : match
<br><br>
Pour vérifier la correspondance d'éléments à une condition
<br><br>
```java
// Vrai si tous les éléments du stream répondent à la condition
boolean allMatch (Predicate<T> predicate)
```
<br>
```java
// Vrai si un ou plusieurs éléments du flux répondent à la condition
boolean anyMatch(Predicate<? super T> predicate)
```
<br>
```java
// Vrai si aucun élément du flux ne répond à la condition
boolean noneMatch(Predicate<? super T> predicate)
```
<br><br>