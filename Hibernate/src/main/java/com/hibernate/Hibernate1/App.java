package com.hibernate.Hibernate1;

//Hibernate is an mapping tool for the Java programming language. It provides a framework for mapping an object-oriented
//domain model to a relational database.


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
      StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build(); 
      Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
      SessionFactory factory = meta.getSessionFactoryBuilder().build();
      Session session = factory.openSession();
      Transaction t1 = session.beginTransaction();
      
      Student s1 = new Student("David", "1126 HieghField Ct");
      Student s2 = new Student("Emre", "1126 HieghField Ct");
      Student s3 = new Student("Aku", "1126 HieghField Ct");
      session.save(s1); session.save(s2); session.save(s3);
      t1.commit();
      System.out.println("Student record saved succesfully");
      factory.close(); session.close();
    }
}
