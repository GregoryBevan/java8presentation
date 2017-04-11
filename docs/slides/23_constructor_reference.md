## Référence de constructeur
<br><br>
En prenant l'interface fonctionnelle suivante
```java
@FunctionalInterface
public interface TeamBuilder {
	Team createTeam(String[] teamFirstName);
}
```
<br>
et la classe définissant une équipe
```java
public class Team {
	public List<String> firstNames;

	public Team(final String[] firstNames) {
		this.firstNames = Arrays.asList(firstNames);
	}
}
```
