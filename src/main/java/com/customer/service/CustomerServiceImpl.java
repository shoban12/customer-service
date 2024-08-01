// Implementing the service class
package com.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Importing required packages
import com.customer.exception.CustomerAlreadyExistsException;
import com.customer.exception.NoSuchCustomerExistsException;
import com.customer.model.Customer;
import com.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRespository;

	// Method to get customer by Id.Throws
	// NoSuchElementException for invalid Id
	public Customer getCustomer(int id) {
		return customerRespository.findById(id)
				.orElseThrow(() -> new NoSuchCustomerExistsException("No Such Customer exists!!"));
	}

	// Method to add new customer details to database.Throws
	// CustomerAlreadyExistsException when customer detail
	// already exist
	public String addCustomer(Customer customer) {
		Customer existingCustomer = customerRespository.findById(customer.getId()).orElse(null);
		if (existingCustomer == null) {
			customerRespository.save(customer);
			return "Customer added successfully";
		} else
			throw new CustomerAlreadyExistsException("Customer already exists!!");
	}

	// Method to update customer details to database.Throws
	// NoSuchCustomerExistsException when customer doesn't
	// already exist in database
	public String updateCustomer(Customer customer) {
		Customer existingCustomer = customerRespository.findById(customer.getId()).orElse(null);
		if (existingCustomer == null)
			throw new NoSuchCustomerExistsException("No Such Customer exists!!");
		else {
			existingCustomer.setName(customer.getName());
			existingCustomer.setAddress(customer.getAddress());
			customerRespository.save(existingCustomer);
			return "Record updated Successfully";
		}
	}
}
