package tnsif.c2tc.batch09.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.batch09.entity.User;
import tnsif.c2tc.batch09.service.UserService;

@RestController

public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/addUser/{id}")
public void addUser(@RequestBody User user)
	{
	service.addUser(user);
    }
@GetMapping("/getUser/{id}")
public User getUser(@PathVariable int id)
{
	return  service.getUser(id);
}
@PutMapping("/updateUser")
public User updateUser(@RequestBody User user)
{
	return service.updateUser(user);
}
@DeleteMapping("/deleteUser/{id}")
public User deleteUser(@PathVariable long id)
{
	 return service.deleteUser(id);
}
@GetMapping("/searchUser/{id}")
public User searchUser(@PathVariable long user)
{
	return service.searchUser(user);
}
}
