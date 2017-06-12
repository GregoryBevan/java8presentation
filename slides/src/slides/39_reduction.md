## Operations terminales : reduction
<br><br>
Retourne une valeur résultant d'une combinaison des éléments du Stream
<br><br>
Les plus connues sont : somme, moyenne, max, min
<br><br><br>
Exemple d'opération de réduction produisant la somme des éléments
```java
Integer totalAgeReduce = roster.stream()
                                .map(Person::getAge)
                                .reduce(0, (a, b) -> a + b);
```
Exemple simplifié
```java
Integer totalAge = roster.stream().mapToInt(Person::getAge).sum();
```
<br>