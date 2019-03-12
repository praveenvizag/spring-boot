package com.spring.boot.swager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "rest/swagger")
public class HelloWorldController {
	
	@ApiOperation(value="Returns the List of Names")
	@GetMapping(value  ="/getList" )
	public ResponseEntity<List> getList() {
		List<String> list = new ArrayList<>();
		list.add("Praveen");
		list.add("Kumar");
		list.add("Konchada");
		list.add("Mindtree");
		return new ResponseEntity<List>(list, HttpStatus.OK);
		
		
	}
	@ApiOperation(value="Returns the Message Posted")
	@PostMapping(value = "/postMsg")
	public ResponseEntity<String> putList(@RequestBody String msg) {
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
		
	}

}
