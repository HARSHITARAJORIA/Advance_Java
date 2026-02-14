package com.lpu;

import javax.security.auth.login.AppConfigurationEntry;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

        public static void main(String args[]){
            org.hibernate.cfg.Configuration config=new org.hibernate.cfg.Configuration();
            config.configure();
            SessionFactory sessionFactory=config.buildSessionFactory();
            Session session=sessionFactory.openSession();
            Transaction tx=session.beginTransaction();
            Product p1=session.get(Product.class,1);
            session.remove(p1);
            tx.commit();
            session.close();
            System.out.println("Data successfully removed");

        }


}
