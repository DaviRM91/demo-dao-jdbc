package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {


        Department dep = new Department(1, "Books");
        Seller seller = new Seller(1, "Bob Brown", "bob@gmail.com", new Date(), 3000.00, dep);

        System.out.println(seller);

    }
}
