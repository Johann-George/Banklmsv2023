package com.johann.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johann.model.User;
import com.johann.Repo.IUserRepo;

@Service
public class UserServiceImplementation implements IUserService {
	
	@Autowired
	private IUserRepo userRepo;
	//Find all users
		@Override
		public List<User> findAllUsers(){
			return (List<User>)userRepo.findAll();
		}
		
		
		//Find by (Email or Phone) & Password
		@Override
		public User findByEmailPhoneAndPassword(String emailOrPhone, String password)
		{
			User _user = userRepo.findByEmailPhoneAndPassword(emailOrPhone, password);
			
			if(_user != null)
			{
				//Check Condition for User
				if( (emailOrPhone.equals(_user.getEmail()) ||
						emailOrPhone.equals(_user.getPhoneNo())) 
						&& password.equals(_user.getPassword()) )
				{
					return _user;
				}
				
				return null;
			}

			return null;
		}

		//Add user
		@Override
		@Transactional
		public User addUser(User user) {
			
			return userRepo.save(user);
		}

		//Update user
		@Override
		@Transactional
		public User updateUser(User user) {
			
			return userRepo.save(user);
		}

		//Disable user
		@Override
		@Transactional
		public void deleteUser(int userId) {
			userRepo.disableById(userId);
			
		}
}
