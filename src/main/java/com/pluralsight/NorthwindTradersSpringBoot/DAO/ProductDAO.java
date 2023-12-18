package com.pluralsight.NorthwindTradersSpringBoot.DAO;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;

public interface ProductDAO {
    public void add(Product product);
    public void getAll();
}
