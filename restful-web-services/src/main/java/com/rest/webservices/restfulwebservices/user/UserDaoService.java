package com.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate  > Database
	// UserDaoService > Static Lists
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 0;
	
	static {
		 users.add(new User(++usersCount,"Ravi",LocalDate.now().minusYears(30)));
		 users.add(new User(++usersCount,"Kiran",LocalDate.now().minusYears(24)));
		 users.add(new User(++usersCount,"Ravikiran",LocalDate.now().minusYears(23)));
		 
	}
	
	 public List<User> findAll(){
		 return users;
	 }
	 
	 public User save(User user) {
		 user.setId(++usersCount);
		 users.add(user);
		 return user;
		 
	 }
	
	 public User findById(int id) {
		 
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	 }
	
	 
	 public void deleteById(int id) {
		 
			Predicate<? super User> predicate = user -> user.getId().equals(id); 
			users.removeIf(predicate);
		 }
	
	

}
