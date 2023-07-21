package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
	
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller sell = sellerDao.findById(3);
		
		System.out.println(sell);
		
		
		
		
		
		
		
		
		
	}

}
