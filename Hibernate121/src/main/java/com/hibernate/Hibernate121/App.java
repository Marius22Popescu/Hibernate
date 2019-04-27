package com.hibernate.Hibernate121;

import java.util.List;

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
    	StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("Hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory factory=meta.getSessionFactoryBuilder().build();
    	Session session=factory.openSession();
    	Transaction t1=session.beginTransaction();
    	Student student = new Student("David", "Shimer", "Computer");
    	Address address = new Address("1126 HighField Ct", "BethelPark", "USA");
    	
    	session.persist(student);
    	
    	
    	student.setAddress(address);
    	address.setStudent(student);
    	session.save(student);
    	t1.commit();
    	@SuppressWarnings("unchecked")
    	List<Student> students = (List<Student>)session.createQuery("from Student").list();
    	for(Student s: students){
    		System.out.println("Details : "+s);		
    	}
    	//session.getTransaction().commit();
    	session.close();
    	
    }
}
