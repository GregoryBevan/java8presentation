## Exemples de méthode statique
<br>
Nouvelle méthode _comparingByKey_ de l'interface _Map_
```java
public static <K extends Comparable<? super K>, V> Comparator<Map.Entry<K,V>> comparingByKey() {
    return (Comparator<Map.Entry<K, V>> & Serializable)
        (c1, c2) -> c1.getKey().compareTo(c2.getKey());
}
```
<br>
Méthode _getZoneId _ de la nouvelle interface _TimeClient_
```java
static ZoneId getZoneId (String zoneString) {
    try {
        return ZoneId.of(zoneString);
    } catch (DateTimeException e) {
        System.err.println("Invalid time zone: " + zoneString +
            "; using default time zone instead.");
        return ZoneId.systemDefault();
    }
}
```
<br>
