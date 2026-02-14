package com.lpu;

import com.lpu.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.security.auth.login.AppConfigurationEntry;

import java.util.Arrays;
import java.util.List;
import org.hibernate.cfg.Configuration;

public class GetData {
    public static void main(String args[]){
        Configuration configuration=new Configuration();
        configuration.configure();



        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Product p=(Product)session.get(Product.class,1);

        System.out.println(p.getId());
        System.out.println(p.getCategory());
        System.out.println(p.getDescription());
        System.out.println(p.getName());
        System.out.println(p.getQuantity());
        System.out.println(p.getSku());



    }
}
