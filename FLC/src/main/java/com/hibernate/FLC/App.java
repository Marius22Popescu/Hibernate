package com.hibernate.FLC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build(); 
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t1 = session.beginTransaction();
        
        Department d = new Department("Mechanical");
        session.save(d);
        t1.commit();
        //fetch department from db first time
        Department d1 = session.load(Department.class, new Integer(1));
        System.out.println(d1.getDeptName());
        //fetch the department again
        d1 = session.load(Department.class, new Integer(1));
        System.out.println(d1.getDeptName());
        
        d1 = session.load(Department.class, new Integer(1));
        System.out.println(d1.getDeptName());
    }
}
