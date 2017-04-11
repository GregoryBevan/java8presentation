## Référence de méthode statique
<br>
<p>
A partir de la méthode statque suivante
</p>
```java
public class StaticMethodReference {
  public static int compareLength(String a, String b) {
  	return Integer.compare(a.length(), b.length());
  }
}
```
<p>
il est possible d'écrire
</p>
```java
Arrays.sort(new String[]{"Grégory", "Antoine", "Eric"},
              StaticMethodReference::compareLength);
```
