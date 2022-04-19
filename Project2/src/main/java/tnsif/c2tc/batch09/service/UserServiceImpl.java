package tnsif.c2tc.batch09.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.batch09.entity.User;
import tnsif.c2tc.batch09.repo.UserRepo;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
UserRepo ur;
	@Override
	public void addUser(User user) {
		ur.save(user);	
		}

	@Override
	public User deleteUser(long id) {
	User u=ur.findById(id).get();
	ur.delete(u);
		return u;
	}

	@Override
	public User updateUser(User user) {
		return ur.save(user);
		
	}

	@Override
	public User getUser(int id) {
		User use=ur.findById((long) id).get();
		return use;
	}

	@Override
	public User searchUser(long id) {
		
		User use=ur.findById(id).get();
	    return use;
	}

}
