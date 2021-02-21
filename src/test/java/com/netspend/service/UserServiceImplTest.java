package com.netspend.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.netspend.data.UserData;
import com.netspend.exception.UserNotFoundException;
import com.netspend.repository.UserRepo;
import com.netspend.response.UserResponse;

class UserServiceImplTest {

	@InjectMocks
	UserServiceImpl userServiceImpl;

	@Mock
	UserRepo userRepo;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testCreateUser() {
		// fail("Not yet implemented");
	}

	@Test
	void testFindUserByFirstName() {
		List<UserData> userDatas = new ArrayList<>();
		UserData userData = new UserData();
		userData.setEmail("demo@gmail.com");
		userData.setFirstName("Demo");
		userData.setLastName("j");
		userData.setPassword("good");
		userDatas.add(userData);

		when(userRepo.findByFirstName(anyString())).thenReturn(userDatas);

		UserResponse users = userServiceImpl.findUserByFirstName("james");
		assertNotNull(users);
		assertEquals(users.getFirstName(), "Demo");
	}

	@Test
	void test_User_does_not_exist_ByFirstName() {

		when(userRepo.findByFirstName(anyString())).thenReturn(null);
		assertThrows(UserNotFoundException.class, () -> userServiceImpl.findUserByFirstName("james"));
	}

}
