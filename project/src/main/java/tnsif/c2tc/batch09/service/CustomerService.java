package tnsif.c2tc.batch09.service;

import tnsif.c2tc.batch09.entity.Customer;

public interface CustomerService {
	public void addcustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);
	public Customer getCustomer(int id);
	public Customer deleteCustomer(long id);
	

}
