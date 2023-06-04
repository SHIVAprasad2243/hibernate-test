package com.test;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Student s1=new Student();
//		s1.setRollNumber(1111);
//		s1.setName("shiva");
//		s1.setGender("male");
//		s1.setNumber("1245364787");
//		s1.setAge(23);
//		
//		
//		
//		Student s2=new Student();
//		s2.setRollNumber(2222);
//		s2.setName("prasad");
//		s2.setAge(25);
//		s2.setGender("male");
//		s2.setNumber("1833512292");
//		
//		
//		
//		et.begin();
//		em.persist(s1);
//		em.persist(s2);
//		et.commit();
//		
		
		
		
		
//		fetch the data from the 
		
Query q1=em.createQuery("select e from Student e ");
		
		
		
		List<Student>li=q1.getResultList();
		for(Student s1:li )
		{
			System.out.println(s1.getRollNumber()+"\t"+s1.getName()+"\t"+s1.getNumber()+"\t"+s1.getAge()+"\t"+s1.getGender());
		}
		
		
		
		
		

		
		System.out.println("enter the roll number");
		int rollNumber=sc.nextInt();
		
		Query q=em.createQuery("select e from Student e where e.rollNumber =?1");
		
		q.setParameter(1,rollNumber);
		
		List<Student>li1=q.getResultList();
		for(Student s1:li1 )
		{
			System.out.println(s1.getRollNumber()+"\t"+s1.getName()+"\t"+s1.getNumber()+"\t"+s1.getAge()+"\t"+s1.getGender());
		}
		
		

	
	
	}

}
