package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.SimpleProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class NorthwindTradersSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
}
