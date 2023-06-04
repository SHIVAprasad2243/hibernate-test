package com.consumer;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.test.Student;

public class Main {
	public static void main(String[] args) {
		
	
	
		
		
		
//		System.out.println("how many fruit u want to insert");
//		int n=sc.nextInt();
//		
//		for(int i=1;i<n;i++)
//		{
//			fruit m=new fruit();
//			System.out.println("enter the id");
//			int id=sc.nextInt();
//		
//			
//			System.out.println("enter the fruit name");
//			String name=sc.next();
//			
//			System.out.println("ent the quantity");
//			int quantity=sc.nextInt();
//	
//			
//			System.out.println("enter the price");
//			int price=sc.nextInt();
//			
//		m.setId(id);
//		m.setF_Name(name);
//		m.setQuantity(quantity);
//		
//		m.setPrice(price);
//		et.begin();
//		em.persist(m);
//		et.commit();
//		}
//		
		
		
		
//		fetch the data
		
		

System.out.println("welcome to fruit shop");
		
		boolean b=false;
		int amount=0;
		int i=0;
		do
		{
			
		
Scanner sc=new Scanner(System.in);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		fruit m=new fruit();
Query q1=em.createQuery("select e1 from fruit e1 ");
       
	
		int total=0;
		
		List<fruit>li=q1.getResultList();
		for(fruit s1:li )
		{
			System.out.println(s1.getId()+"\t"+s1.getF_Name()+"\t"+s1.getQuantity()+"\t"+s1.getPrice());
		}
		
		
		
		System.out.println("which fruit u want and how many");
		System.out.println("enter the fruits");
		String nam=sc.next();
		System.out.println("enter the quantity");
		int qua=sc.nextInt();
		
			Query q2=em.createQuery("select e1 from fruit e1 where e1.f_Name=?1 ");
			q2.setParameter(1,nam);
		List<fruit>li2=q2.getResultList();
		for(fruit s1:li2 )
		{
			System.out.println("bill for "+s1.getF_Name()+"="+qua*s1.getPrice());
			total=s1.getQuantity();
			 amount += qua*s1.getPrice();
			
		}
		
//		System.out.println("remaining quantity");
		
		
		int rem=total-qua;
//		System.out.println(rem);
		
		Query q3=em.createQuery("update fruit e2 set e2.quantity='"+rem+"'where e2.f_Name=?1");
		q3.setParameter(1,nam);
		
		
		i=q3.executeUpdate();
		if(i>0)
			
		{
			System.out.println("table updated");
		}
		et.commit();
		
		
		System.out.println("if you want to buy one more product enter yes other wise no");
		
//		System.out.println("do you want insert one more row \n enter yes for new roe r no for exits");
		String decision=sc.next();
		if((decision.equalsIgnoreCase("no")))
		{
			b=true;
			
		}
		}
		
		while(!b);
		System.out.println("total amount="+amount);

		
		
		
		
		
	
	}

	

}
