package ua.lviv.ura.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.ura.dao.CategoriDao;
import ua.lviv.ura.dao.impl.CategoriDaoImpl;
import ua.lviv.ura.domain.Categori;
import ua.lviv.ura.service.CategoriService;

public class CategoriServiceImpl implements CategoriService {

	private CategoriDao categoriDao;
	
	public CategoriServiceImpl(){
		try {
			categoriDao = new CategoriDaoImpl();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Categori create(Categori t) {
		
		return categoriDao.create(t);
	}

	@Override
	public List<Categori> readAll() {
		
		return categoriDao.readAll();
	}

	@Override
	public Categori read(int id) {
		
		return categoriDao.read(id);
	}

	@Override
	public Categori update(Categori t) {
		
		return categoriDao.update(t);
	}

	@Override
	public void delete(int id) {
		
		categoriDao.delete(id);
	}
}
