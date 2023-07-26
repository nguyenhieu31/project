package com.laptrinhjavaweb.Util;


import com.laptrinhjavaweb.entity.Products;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

public class DatabaseUtil {
    private final static SessionFactory FACTORY;
    static{
        Configuration configuration= new Configuration();
        Properties props= new Properties();
        props.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        props.put(Environment.URL,"jdbc:mysql://localhost:3306/mvcproject1");
        props.put(Environment.USER, "root");
        props.put(Environment.PASS,"");
        props.put(Environment.SHOW_SQL,true);
        configuration.setProperties(props);
        configuration.addAnnotatedClass(Products.class);
        ServiceRegistry registry= configuration.getStandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        FACTORY= configuration.buildSessionFactory(registry);
    }
    public static SessionFactory getSessionFactory(){
        return FACTORY;
    }
}
