package com.pluralsight.NorthwindTradersSpringBoot.DAO;

import com.pluralsight.NorthwindTradersSpringBoot.DAO.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDAO implements ProductDAO {
    private List<Product> products;

    public SimpleProductDAO() {
        this.products = new ArrayList<>();
        Product product1 = new Product(1, "Desi", "House", 300_000D);
        Product product2 = new Product(2, "Rorie", "Car", 30_000D);
        products.add(product1);
        products.add(product2);
    }
    @Override
    public void add(Product product) {
        products.add(product);
    }

     @Override
    public void getAll() {
        for (Product product: products ) {
            System.out.println(product.toString());
        }
    }
}


