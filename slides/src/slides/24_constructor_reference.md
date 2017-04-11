## Référence de constructeur
<br><br>
Il est possible d'écrire
```java
TeamBuilder teamBuilder = (names) -> new Team(names);
Team team = teamBuilder.createTeam(
							new String[]{"Antoine", "Guillaume", "Fabien"});
```
<br><br>
ou de préférence en utilisant une référence de constructeur
```java
TeamBuilder teamBuilder = Team::new;
```
<br>
