package tnsif.c2tc.batch09.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tnsif.c2tc.batch09.entity.User;
public interface UserRepo extends JpaRepository<User, Long>{

	
}


