package ua.lviv.ura.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.ura.dao.ProductDao;
import ua.lviv.ura.dao.impl.ProductDaoImpl;
import ua.lviv.ura.domain.Product;
import ua.lviv.ura.service.ProductService;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao;
	
	public ProductServiceImpl(){
		try {
			productDao = new ProductDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product create(Product t) {
		
		return productDao.create(t);
	}

	@Override
	public List<Product> readAll() {
		
		return productDao.readAll();
	}

	@Override
	public Product read(int id) {
		
		return productDao.read(id);
	}

	@Override
	public Product update(Product t) {
		
		return productDao.update(t);
	}

	@Override
	public void delete(int id) {
		
		productDao.delete(id);
	}
}
