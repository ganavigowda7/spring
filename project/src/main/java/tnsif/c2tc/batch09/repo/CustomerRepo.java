package tnsif.c2tc.batch09.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import tnsif.c2tc.batch09.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{

	}	
