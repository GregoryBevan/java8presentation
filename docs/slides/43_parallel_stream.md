## Parallel stream
<br><br>
Création avec la méthode _parallelStream()_ au lieu de _stream()_
<br><br>
Opérations réalisées sur plusieurs Thread
<br><br>
Opérations stateless car exécutées de façon aléatoires (ThreadSafe)
<br><br>
```java
int[] shortWords = new int[12]; 
words.parallelStream().forEach(s -> { 
    if (s.length() < 12) shortWords[s.length()]++; // Not thread safe! 
}); 
System.out.println(Arrays.toString(shortWords));
```
<br><br>