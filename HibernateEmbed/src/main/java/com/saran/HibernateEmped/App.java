package com.saran.HibernateEmped;

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
    	StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory factory=meta.getSessionFactoryBuilder().build();
    	Session session=factory.openSession();
    	Transaction t1=session.beginTransaction();

    		
    	Address s1 = new Address("1126 Highfield CT","Bethel Park","PA","USA");
    	Address s2 = new Address("1127 Highfield CT","Bethel Park","PA","USA");
    	Address s3 = new Address("1128 Highfield CT","Bethel Park","PA","USA");
    	
    	Employee e1=new Employee(1001,"Akku",s1);
    	Employee e2=new Employee(1002,"David",s2);
    	Employee e3=new Employee(1003,"Amar",s3);
    	session.save(e1);session.save(e2);session.save(e3);
    	t1.commit();
    	System.out.println("Employee records saved successfully");
    	session.close();factory.close();
    	
    }
}
