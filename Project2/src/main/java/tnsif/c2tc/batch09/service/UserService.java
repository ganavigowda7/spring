package tnsif.c2tc.batch09.service;

import tnsif.c2tc.batch09.entity.User;

public interface UserService {

	 public void addUser(User user);
	 
		public User updateUser(User user);
		public User getUser(int id);
		public User deleteUser(long id);
		public User searchUser(long id);
	}


