import java.sql.Date;
import java.time.LocalDate;

import ua.lviv.ura.domain.Categori;
import ua.lviv.ura.domain.Korzina;
import ua.lviv.ura.domain.Product;
import ua.lviv.ura.domain.User;
import ua.lviv.ura.service.CategoriService;
import ua.lviv.ura.service.KorzinaService;
import ua.lviv.ura.service.ProductService;
import ua.lviv.ura.service.UserService;
import ua.lviv.ura.service.impl.CategoriServiceImpl;
import ua.lviv.ura.service.impl.KorzinaServiceImpl;
import ua.lviv.ura.service.impl.ProductServiceImpl;
import ua.lviv.ura.service.impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		UserService us = new UserServiceImpl();
		us.create(new User("test","test","test","test"));
		us.delete(2);
		System.out.println(us.read(5).toString());
		us.update(new User(5,"test2","test2","test2","test2"));
		System.out.println(us.read(5).toString());
		
		CategoriService cs = new CategoriServiceImpl();
		cs.create(new Categori("test"));
		cs.delete(1);
		
		ProductService ps = new ProductServiceImpl();
		ps.create(new Product(2,"test","test",100));
		System.out.println(ps.readAll().toString());
		
		KorzinaService ks = new KorzinaServiceImpl();
		ks.create(new Korzina(1,1,Date.valueOf(LocalDate.now())));
		ks.delete(1);

	}

}
