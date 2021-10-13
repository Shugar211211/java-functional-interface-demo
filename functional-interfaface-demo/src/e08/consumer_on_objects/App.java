package e08.consumer_on_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 45, "Alice"));
		studentList.add(new Student(2, 65, "Bob"));
		studentList.add(new Student(3, 80, "Clair"));
		studentList.add(new Student(4, 20, "Dom"));
		
		Consumer<String> capsConsumer = name -> System.out.println(name.toUpperCase());
		
		studentList.stream().map(student -> student.getName()).forEach(capsConsumer);
	}
}
