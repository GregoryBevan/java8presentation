## Exemples de méthode par défaut
<br><br>
Nouvelle méthode _sort_ de l'interface _List_
```java
default void sort(Comparator<? super E> c) {
    Collections.sort(this, c);
}
```
<br>
Méthode _andThen_ dans l'interface fonctionnelle _Function_
```java
default <V> Function<T, V> andThen(Function<R,V> after) {
    Objects.requireNonNull(after);
    return (T t) -> after.apply(apply(t));
}
```
