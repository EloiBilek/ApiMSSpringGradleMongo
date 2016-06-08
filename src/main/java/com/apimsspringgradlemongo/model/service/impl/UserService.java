package com.apimsspringgradlemongo.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.apimsspringgradlemongo.model.entity.User;
import com.apimsspringgradlemongo.model.repository.IUserRepository;
import com.apimsspringgradlemongo.model.service.IUserService;

/**
 * @author eloi eloibilek@gmail.com
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository userRepository;

	public UserService() {
		super();
	}

	@Override
	public User findById(final String id) {
		User user = userRepository.findOne(id);
		return user;
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		users = userRepository.findAll();
		return users;
	}

	@Override
	public User create(final User user) {
		return userRepository.insert(user);
	}

	@Override
	public User update(User user) {
		user = userRepository.save(user);
		return user;
	}

	@Override
	public void deleteById(final String id) {
		userRepository.delete(id);
	}

	@Override
	public Page<User> findPaginated(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(User entity) {
		userRepository.delete(entity);
	}
}
