## Exemple de comparateur
<br><br>
```java
Comparator<String> stringLengthComparator = (s1, s2) -> {
	int compareTo = Integer.compare(s1.length(), s2.length());
	System.out.printf("Compare \"%s\" et \"%s\" : %s \n", s1, s2, compareTo);
	return compareTo;
};
```
<br>
