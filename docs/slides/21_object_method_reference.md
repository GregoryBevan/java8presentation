## Référence de méthode d'objet
<br>
<p>
La classe suivante possède une méthode _compareTo_
</p>
```java
class ReverseComparator {
		public int compareTo(String a, String b) {
			return b.compareTo(a);
		}
}
```
<p>
qui permet d'écrire le code suivant
</p>
```java
ReverseComparator customStringComparator = new ReverseComparator();
Arrays.sort(new String[]{"Grégory", "Antoine", "Eric"},
            (nom1, nom2) -> customStringComparator.compareTo(nom1, nom2));
```
<p>
et que nous simplifions comme ceci
</p>
```java
Arrays.sort(new String[]{"Grégory", "Antoine", "Eric"},
              customStringComparator::compareTo);
```
<br>
