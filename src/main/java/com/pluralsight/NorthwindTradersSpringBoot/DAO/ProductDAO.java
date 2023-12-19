package com.pluralsight.NorthwindTradersSpringBoot.DAO;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;



public interface ProductDAO  {
     void add(Product product);
     void getAll();
}
