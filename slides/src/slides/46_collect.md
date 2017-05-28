## Operations terminales : collect
<br><br>
Récupérer les éléments du stream dans une nouvelle structure
<br><br>
Dans un tableau
```java
Person[] men = roster.stream().filter(p -> p.getGender() == MALE)
                              .toArray(Person[]::new);
```
<br>
Dans une liste
```java
List<Person> collect = roster.stream().filter(p -> p.getAge() < 18)
                                      .collect(Collectors.toList());
```
<br>