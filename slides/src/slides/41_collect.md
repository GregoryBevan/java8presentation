## Operations terminales : collect
<br><br>
Dans un set
```java
Set<Person> collect = roster.stream().filter(p -> p.getAge() < 18)
                                      .collect(Collectors.toSet());
```
<br>
Dans une map
```java
Map<String, Person> rosterAsMap = roster.stream().collect(
                                Collectors.toMap(p->p.firstName.toLowerCase(), 
                                Function.identity()))
```
<br>