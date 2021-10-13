package predicate_8_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//https://www.geeksforgeeks.org/java-8-predicate-with-examples/

public class User {
	
	String name, role;
	User(String a, String b) {
		name = a;
		role = b;
	}
	
	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", role=" + role + "]";
	}

	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("John", "admin"));
		users.add(new User("Peter", "member"));
		List<User> admins = users.stream().filter((user) -> user.getRole().equals("admin")).collect(Collectors.toList());
		System.out.println(admins);		
	}
}
