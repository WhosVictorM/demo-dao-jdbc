package application;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao deptDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findById() ===");
		Department dep = deptDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: Department findAll() ===");
		List<Department> list = deptDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
		System.out.println("\n=== TEST 3: Department insert() ===");
		Department newDep = new Department(null, "Music");
		deptDao.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId());
				
		System.out.println("\n=== TEST 4: Department update() ===");
		dep = deptDao.findById(6);
		dep.setName("Decoration");
		deptDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 5: Department delete() ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		deptDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}
	
	
	
}
