## Interfaces fonctionnelles génériques
<br>
<p>
Contenues dans le package _java.util.function_
</p>
<br>
<table>
  <tr>
    <td>**Supplier`<T`>**</td>
    <td>Fournit un élément de type T</td>
    <td><code>T get()</code></td>
  </tr>
  <tr>
    <td>**Consumer`<T`>**</td>
    <td>Consomme un élément de type T</td>
    <td><code>void accept(T t)</code></td>
  </tr>
  <tr>
    <td>**Function`<T,R`>**</td>
    <td>Transforme un élément de type T en élément de type R</td>
    <td><code> R apply(T t) </code></td>
  </tr>
  <tr>
    <td>**Predicate`<T`>**</td>
    <td>Vérifie une condition sur un élément de type T </td>
    <td><code>boolean test(T t)</code></td>
  </tr>
  <tr>
    <td colspan="3">...</td>
  </tr>
</table>
