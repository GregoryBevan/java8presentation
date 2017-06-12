## Instant
<br><br>
Représente le temps machine
<br><br>
Adapté pour gérer les timestamps
<br><br>
Démarre en 1970-01-01T00:00:00Z (Unix Epoch)
<br><br>
```java
Instant timestamp = Instant.now();
long numberOfSecondsSinceEpoch = now.getEpochSecond();
long hoursBeforeEnfOfMachineTime = now.until(Instant.MAX, ChronoUnit.HOURS); 
```
<br><br>
