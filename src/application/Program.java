package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department obj = new Department(1, "Books");
		
		Seller sell = new Seller(1, "Alex Green", "Alex@gmail.com",sdf.parse("28/09/1981"),1390.00, obj);
		
		System.out.println(obj);
		
		System.out.println(sell);
		
		
		
		
		
		
		
		
	}

}
