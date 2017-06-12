## ZonedDateTime
<br><br>
Construction de date et heure avec fuseau horaire
```java
ZonedDateTime now =  ZonedDateTime.now();
ZonedDateTime fromLocalDate = ZonedDateTime.of(LocalDateTime.now(), 
                                               ZoneId.of("Europe/Paris"));
ZonedDateTime startingDate = ZonedDateTime.parse("2017-06-19T07:30:00Z");
```
<br>
Manipulation de date et heure avec fuseau horaire
```java
ZonedDateTime utc = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("UTC");
ZoneOffset offset = ZonedDateTime.now().getOffset();
ZoneId ourZoneId = ZonedDateTime.now().getZone();
```
<br><br>
