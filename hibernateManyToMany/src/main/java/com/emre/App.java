package com.emre;

import org.hibernate.*;

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

    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory=meta.getSessionFactoryBuilder().build();
        Session session=factory.openSession();
        Transaction t1=session.beginTransaction();
        
        Student student1 = new Student("David","Shimer");
        Student student2 = new Student("morris","popesco");
     

        Subject subject1 = new Subject("IT");
        Subject subject2 = new Subject("Mechanical");
        Subject subject3 = new Subject("AI");
        
        student1.getSubjects().add(subject1);
        student1.getSubjects().add(subject2);
        session.save(student1);
        session.save(student2);
        t1.commit();
        session.close();factory.close();
        System.out.println("Done");

    }
}