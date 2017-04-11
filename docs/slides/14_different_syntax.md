## Différentes notations
<br>
Pas de paramètre / Expression simple
```java
Runnable runnable = () -> System.out.println("New thread");
```
Avec paramètre typé / Bloc d'instruction
```java
Function<String,String> uppercase = (String s) -> {return s.toUpperCase();};
```
Paramètre sans type (déduit par le compilateur) / Return implicite
```java
Comparator<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
```
Paramètre unique sans parenthèse
```java
Function<String, String> lowercase = s -> s.toLowerCase();
```
