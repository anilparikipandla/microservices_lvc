package com.example.demo;
import java.util.ArrayList;
import java.util.*;

public class UserDB {

	public UserDB() {
		// TODO Auto-generated constructor stub
	}
	private static HashMap<Integer, User> DB = new HashMap<>();
	
	static {
		User one = new User(1, "Anil", "Parikipandla");
		User two = new User(2, "Bharathi", "Bandi");
		User three= new User(3, "Raj", "KUmar");
		User four = new User(4, "Ram", "Mishra");
		
		DB.put(1, one);
		DB.put(2,two);
		DB.put(3, three);
		DB.put(4, four);
	}
	
	public static ArrayList<User> getUsers(){
		ArrayList<User> list = new ArrayList<>(DB.values());
		return list;
	}

	public static User getUserById(Integer id) {
		return DB.get(id);
	}
	
	public static void addUser(User user) {
		DB.put(user.getId(), user);
	}
	
	public static void updateUser(User user) {
		DB.put(user.getId(), user);
	}
	
	public static void removeUser(Integer id) {
		DB.remove(id);
	}
}
