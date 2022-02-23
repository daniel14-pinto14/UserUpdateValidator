package com.tbp.crud;

import com.tbp.crud.controller.UserController;
import com.tbp.crud.dao.UserRepository;
import com.tbp.crud.entity.Address;
import com.tbp.crud.entity.UserDetails;
import com.tbp.crud.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringBootValiduserTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserService userService;

	@Autowired
	UserController userController;


	public UserDetails Setup() {
		UserDetails userDetails = new UserDetails();
		userDetails.setId(1);
		userDetails.setLastName("pinto");
		userDetails.setFirstName("Daniel");
		userDetails.setTitle("Mr");

		Address address = new Address();
		address.setId(1);
		address.setUser(userDetails);
		address.setCity("sydney");
		return userService.createUser(userDetails);
	}

	@Test
	public void  UserCreation() {
		UserDetails createdUser = Setup();
		assertEquals(1,createdUser.getId());
	}

	@Test
	public void  retrieveUser() {
		UserDetails createdUser = Setup();
		UserDetails user = userService.getUserById(1);
		assertEquals(1,createdUser.getId());
	}

}
