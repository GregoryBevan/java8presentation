## Opérations intermédiaires sans état
<br>
```java
// Filtrer sous condition
filter(Predicate<? super T> predicate) 
```
```java
// Appliquer une transformation
map(Function<? super T,? extends R> mapper) 
```
```java
// Applique une transformation et linéarise le résultat
flatMap(Function<? super T,? extends Stream<? extends R>> mapper) 
```
```java
// Réalise l'action et retourne un Stream identique
peek(Consumer<? super T> action) 
```
```java
// Limite la taille du Stream
limit(long maxSize) 
```
```java
// Skip les n derniers éléments du Stream
skip(long n) 
```
<br>