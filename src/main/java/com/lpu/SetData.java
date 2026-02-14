package com.lpu;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.util.Date;

public class SetData {
    public static void main(String args[]){

        System.out.println("Data is been storing in the database..!!!");


        Configuration config=new Configuration();
        config.configure();
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Product p1= new Product();
        Product p2=new Product();
        p1.setActive(true);
        p1.setCategory("Food");
        p1.setDescription("Eat healthy food");
        p1.setName("Biscuit");
        p1.setPrice(20);
        p1.setSku("10H3");
        p1.setQuantity(500);

        p2.setActive(true);
        p2.setCategory("Cloths");
        p2.setDescription("Trendy Cloths");
        p2.setName("Shirt");
        p2.setPrice(500);
        p2.setSku("10H4");
        p2.setQuantity(50);


        Transaction tx=session.beginTransaction();
        session.persist(p1);
        session.persist(p2);
        tx.commit();
        session.close();

    }
}
