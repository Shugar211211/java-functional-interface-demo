package predicate_7_predicate_in_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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
		List<User> admins = process(users, (User u) -> u.getRole().equals("admin"));
		System.out.println(admins);		
	}

	private static List<User> process(List<User> users, Predicate<User> predicat) {
		List<User> result = new ArrayList<User>();
		for(User user : users)
			if(predicat.test(user))
				result.add(user);
		return result;
	}
}
