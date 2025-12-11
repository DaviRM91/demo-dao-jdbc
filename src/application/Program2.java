package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();


        /*System.out.println("\n=== TEST 4: seller insert ===");
        Department newDepartment = new Department(null,"Jogos e Games");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Department = " + newDepartment.getName());*/

        /*System.out.println("\n=== TEST 5: Department Update ===");
        Department department = departmentDao.findById(8);
        department.setName("Games");
        departmentDao.update(department);
        System.out.println("Update completed");*/

        System.out.println("\n=== TEST 6: Department Delete ===");
        System.out.println("Enter id for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");



    }

}
