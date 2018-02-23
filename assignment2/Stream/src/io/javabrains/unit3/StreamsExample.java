package io.javabrains.unit3;
import java.util.Arrays;
import java.util.List;
import io.javabrains.common.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person>people = Arrays.asList(
				new Person("Charles","Dickens",60),
				new Person("Lewis","Chharoll",42),
				new Person("Mathew","Carlyle",36),
				new Person("Dickinson","Henrick",53),
				new Person("Charlotte","Arnold",81)
				);
people.stream()
.filter(p -> p.getLastname().startsWith("C"))
.forEach(p -> System.out.println(p.getFirstname()));
	
	}


}
