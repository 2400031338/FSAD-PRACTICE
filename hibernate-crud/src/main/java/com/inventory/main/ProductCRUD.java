package com.inventory.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.inventory.entity.Product;
import com.inventory.util.HibernateUtil;

public class ProductCRUD 
{
    public static void addProduct(Product product) 
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(product);

        tx.commit();
        session.close();
    }
    public static Product getProduct(int id) 
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Product product = session.get(Product.class, id);
        session.close();
        return product;
    }
    public static void updateProduct(int id, double price, int quantity) 
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.get(Product.class, id);
        if (product != null)
        {
            product.setPrice(price);
            product.setQuantity(quantity);
            session.update(product);
        }

        tx.commit();
        session.close();
    }
    public static void deleteProduct(int id) 
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product product = session.get(Product.class, id);
        if (product != null)
        {
            session.delete(product);
        }

        tx.commit();
        session.close();
    }
}
