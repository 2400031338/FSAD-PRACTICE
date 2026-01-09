package com.inventory.main;

import com.inventory.entity.Product;

public class MainApp {

    public static void main(String[] args) 
    {
        Product p1 = new Product("Laptop", "Dell i5", 60000, 10);
        Product p2 = new Product("Mouse", "Wireless Mouse", 800, 50);

        ProductCRUD.addProduct(p1);
        ProductCRUD.addProduct(p2);

        Product product = ProductCRUD.getProduct(1);
        System.out.println("Product Name: " + product.getName());

        ProductCRUD.updateProduct(1, 58000, 8);

        ProductCRUD.deleteProduct(2);
        System.out.println("CRUD Operation Completed.");
    }
}
