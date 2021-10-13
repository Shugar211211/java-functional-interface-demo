package e09.consumer.andthen;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

// https://www.javainterviewpoint.com/java-consumer-example/

public class App {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, 25, "Adam"));
		studentList.add(new Student(2, 35, "Bob"));
		studentList.add(new Student(3, 45, "Danny"));
		studentList.add(new Student(4, 55, "Will"));
		
		Consumer<List<Student>> addMarksConsumer = list -> {
			for(int i=0; i<list.size(); i++) 
				list.get(i).setMark(list.get(i).getMark() + 20);
		};
		
		Consumer<List<Student>> printConsumer = list -> list.forEach(System.out::println);
		
		addMarksConsumer.andThen(printConsumer).accept(studentList);
	}
}
