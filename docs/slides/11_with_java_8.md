## Avec Java 8
<br><br>
```java
Runnable task = () -> System.out.println("Run a new thread with lambdas");

ExecutorService executor = Executors.newSingleThreadExecutor();
executor.execute(task);
executor.shutdown();
```
