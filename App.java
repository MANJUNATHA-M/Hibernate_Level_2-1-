package com.hibernate.level2.LEVEL_2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
        
    	Person p=new Person();
    	p.setpId(1);
    	p.setpName("HANSA");
    	p.setpAge(23);
    	
    	Person p1=new Person();
    	p1.setpId(2);
    	p1.setpName("HINATA");
    	p1.setpAge(16);
    	
    	Person p2=new Person();
    	p2.setpId(3);
    	p2.setpName("MANU");
    	p2.setpAge(22);
    	
    	Person p3=new Person();
    	p3.setpId(4);
    	p3.setpName("NARUTO");
    	p3.setpAge(15);
    	
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Person.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
    	
		
		session.save(p3);
		session.save(p2);
		session.save(p1);
		session.save(p);
		
		
		trans.commit();
		session.close();
     	
    }
}
