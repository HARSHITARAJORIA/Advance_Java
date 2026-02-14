package com.lpu;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {
    public static void main(String args[]){
        Configuration config=new Configuration();
        config.configure();
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Product p1=session.get(Product.class,1);
        p1.setPrice(2000);
        tx.commit();
        session.close();
        System.out.println("Data successfully updated");

    }
}
