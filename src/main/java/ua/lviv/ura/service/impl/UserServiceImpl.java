package ua.lviv.ura.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.ura.dao.UserDao;
import ua.lviv.ura.dao.impl.UserDaoImpl;
import ua.lviv.ura.domain.User;
import ua.lviv.ura.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(){
		try {
			userDao = new UserDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User create(User t) {
		
		return userDao.create(t);
	}

	@Override
	public List<User> readAll() {
		
		return userDao.readAll();
	}

	@Override
	public User read(int id) {
		
		return userDao.read(id);
	}

	@Override
	public User update(User t) {
		
		return userDao.update(t);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
		
	}
	
}
