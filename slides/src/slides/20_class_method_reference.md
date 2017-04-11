## Référence de méthode de classe
<br>
<p>
L'expression lambda suivante
</p>
```java
Arrays.sort(new String[]{"Grégory", "Antoine", "Eric"},
            (nom1, nom2) -> nom1.compareTo(nom2));
```
<br>
<p>
se simplifie en
</p>
```java
Arrays.sort(new String[]{"Grégory", "Antoine", "Eric"}, String::compareTo);
```
<br>
en faisant référence à la méthode
```java
public int compareTo(String anotherString)
```
<br>
