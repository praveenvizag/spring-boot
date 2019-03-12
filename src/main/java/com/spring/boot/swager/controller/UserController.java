package com.spring.boot.swager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.swager.model.User;
import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value  = "/getUserDetails")
public class UserController {

	@ApiOperation(value="Returns the List of Users")
	@GetMapping(value = "/getUSerList")
	public ResponseEntity<List> getUserList() {
		List<User> list = new ArrayList<>();
		User user = new User();
		user.setName("Praveen");
		user.setSalary(12345.76);

		User user1 = new User();
		user1.setName("KOnchada");
		user1.setSalary(12345.76);
		list.add(user1);
		list.add(user);

		return new ResponseEntity<List>(list, HttpStatus.OK);

	}

}
