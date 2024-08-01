// Creating Rest Controller CustomerController which
// defines various API's.
package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	// Get Customer by Id
	@GetMapping("/getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id") int id) {
		return customerService.getCustomer(id);
	}

	// Add new Customer
	@PostMapping("/addCustomer")
	public String addcustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	// Update Customer details
	@PutMapping("/updateCustomer")
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
}
