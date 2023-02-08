package com.craft.springbootdata.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.craft.springbootdata.model.interview_result;
import com.craft.springbootdata.repository.UsersRepository;


//@CrossOrigin(origins = "http://localhost:8081")
@RestController
//@RequestMapping("/api")
public class UsersController {

	@Autowired
	UsersRepository UserRepository;

	@GetMapping("/USERS")
	public ResponseEntity<List<interview_result>> getAllUSERS(@RequestParam(required = false) String CANDIDATE_NAME) {
		try {
			List<interview_result> USERS = new ArrayList<interview_result>();

			if (CANDIDATE_NAME == null)
				UserRepository.findAll().forEach(USERS::add);
			
			else
				UserRepository.findByTitleContaining(CANDIDATE_NAME).forEach(USERS::add);

			if (USERS.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(USERS, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}