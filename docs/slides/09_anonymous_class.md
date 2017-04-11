## Profiter des classes anonymes
<br><br>
```Java
Runnable task = new Runnable() {
	@Override
	public void run() {
			System.out.println("Run a new thread");
	}
};		

ExecutorService executor = Executors.newSingleThreadExecutor();
executor.execute(task);
executor.shutdown();
```
<br><br>
