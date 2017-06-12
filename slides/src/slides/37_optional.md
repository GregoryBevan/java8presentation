## Optional
<br>
Wrapper d'objet pour éviter les NullPointerException
<br><br>
Exemple de déclaration
```java
Optional<String> nonNull  = Optional.of("Non null");
Optional<String> empty    = Optional.empty();
Optional<String> inconnu  = Optional.ofNullable(nullOuPas);
```
<br>Exemple d'utilisation
```java
String s2 = inconnu.orElse("Par défaut");
// or
inconnu.ifPresent(System.out::println);
```