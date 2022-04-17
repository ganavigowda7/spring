package tnsif.c2tc.batch09.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.batch09.entity.Customer;

import tnsif.c2tc.batch09.repo.CustomerRepo;
 

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepo cr;
	@Override
	public void addcustomer(Customer customer) {
		cr.save(customer);
		
	}

	@Override
	public Customer deleteCustomer(long id) {
		Customer c=cr.findById(id).get();
		cr.delete(c);
			return c;
	
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return cr.save(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		Customer customer=cr.findById((long) id).get();
		return customer;
	}

	
}
