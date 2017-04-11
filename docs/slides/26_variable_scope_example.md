## Illustration de la portée des variables
```java
int counter = 0;
int[] counterArray = new int[1];
List<String> list = new ArrayList<>();

Runnable runnable = () -> {
	System.out.printf("Counter : %s \n", counter); // Counter peut être lue
	// counter++; // Counter ne peut  pas être modifiée
	counterArray[0]++; // Pas thread safe
	list.add(String.valueOf(counterArray[0]));
	System.out.printf("Counter array : %s \n", counterArray[0]);
};
```
