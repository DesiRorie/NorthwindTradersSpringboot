package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.DAO.SimpleProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;
@SpringBootApplication
public class NorthwindApplication implements CommandLineRunner {

    @Autowired
    private  ProductDAO productDAO;

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option");
        System.out.println("1. List products");
        System.out.println("2. Add product");
        int chosenOption = scanner.nextInt();
        System.out.println();
        switch (chosenOption) {
            case 1: {
                productDAO.getAll();
                break;
            }
            case 2: {
                System.out.println("What is the productID?");
                int id = scanner.nextInt();
                System.out.println();

                System.out.println("What is the name?");
                String name = scanner.next();
                System.out.println();

                System.out.println("What is the category");
                String category = scanner.next();
                System.out.println();

                System.out.println("What is the price");

                double price = scanner.nextDouble();
                System.out.println();


                Product product = new Product(id, name, category, price);

                productDAO.add(product);

                System.out.println("Added!");
                productDAO.getAll();
                break;
            }

        }

    }
}
