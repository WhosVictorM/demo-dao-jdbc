package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== TEST 1: Seller findById() ===");
		Seller sell = sellerDao.findById(3);
		System.out.println(sell);

		System.out.println("\n=== TEST 2: Seller findByDepartment() ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: Seller findAll() ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: Seller insert() ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", sdf.parse("04/06/2003"), 4000.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: Seller update() ===");
		sell = sellerDao.findById(1);
		sell.setName("Martha Waine");
		sellerDao.update(sell);
		System.out.println("Update completed!");

		System.out.println("\n=== TEST 6: Seller delete() ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");

		sc.close();
	}

}
