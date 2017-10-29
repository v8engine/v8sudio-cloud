/**
 * 版权所有 v8en.com
 * 
 * 作者： Simon
 */
package com.v8en.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.v8en.cloud.domain.User;
import com.v8en.cloud.repository.UserRepository;

/**
 * @author Simon
 * web-site : www.v8en.com
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id)
	{
		return this.userRepository.findOne(id);
	}
	
	@PostMapping("/user")
	public User postUser(@RequestBody User user)
	{
		return user;
	}
}
