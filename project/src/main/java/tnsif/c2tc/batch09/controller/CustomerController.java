package tnsif.c2tc.batch09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tnsif.c2tc.batch09.entity.Customer;

import tnsif.c2tc.batch09.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	@PostMapping("/addCustomer/{id}")
	public void addCustomer(@RequestBody Customer customer)
	{
		service.addcustomer(customer);
	}
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable int id)
	{
		return service.getCustomer(id);
	}
	@DeleteMapping("/deleteCustomer/{id}")
	public Customer deleteUser(@PathVariable long id)
	{
		 return service.deleteCustomer(id);
	}
	@PutMapping("/updateCustomer")
	public Customer updateUser(@RequestBody Customer customer)
	{
		return service.updateCustomer(customer);
	}
}
