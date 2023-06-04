package App_storage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;

import org.hibernate.internal.build.AllowSysOut;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("shiva");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		et.begin();
//		L_App l1=new L_App();
//		l1.setL_name("premium pro");
//		l1.setL_Storage("2500");
//		l1.setL_price(2000);
//		
//		L_App l2=new L_App();
//		l2.setL_name("photoShop7");
//		l2.setL_Storage("3021");
//		l2.setL_price(1500);
//		
//		L_App l3=new L_App();
//		l3.setL_name("cs2");
//		l3.setL_Storage("3500");
//		l3.setL_price(3000);
//		
//		P_App p1=new P_App();
//		p1.setP_name("chorme");
//		p1.setP_storage("300");
//		p1.setP_price(200);
//		
//		P_App p2=new P_App();
//		p2.setP_name("calculator");
//		p2.setP_price(0);
//		p2.setP_storage("120");
//		
//		
//		
//		List< P_App>li1=new ArrayList<P_App>();
//		li1.add(p2);
//		li1.add(p1);
//		
//		l1.setP(li1);
//		
//		
//		List< P_App>li2=new ArrayList<P_App>();
//		li2.add(p2);
//		l2.setP(li2);
//		
//		
//		List<L_App>li3=new ArrayList<L_App>();
//		li3.add(l1);
//		li3.add(l2);
//		
//		p1.setL(li3);
//		
//		List<L_App>li4=new ArrayList<L_App>();
//		li4.add(l3);
//		li4.add(l2);
//		p2.setL(li4);
//		
//		
//		
//		em.persist(l1);
//		em.persist(l2);
//		em.persist(l3);
//		em.persist(p1);
//		em.persist(p2);
//		
//		
//		et.commit();
//		
		
		
		et.begin();
		
		TreeSet<Integer>f1=new TreeSet<Integer>();
		
		
		Query q=em.createQuery("select e from P_App e");
		List<P_App>r1=q.getResultList();
		for(P_App a1:r1)
		{
			System.out.println("phone App "+a1.getP_name()+" storage kb ="+a1.getP_storage());
			f1.add(a1.getP_storage());
			
		}
		
		Query q1=em.createQuery("select e from L_App e");
		List<L_App>r2=q1.getResultList();
		for(L_App a2:r2)
		{
			System.out.println("laptop App "+a2.getL_name()+" storage in kb ="+a2.getL_Storage());
			f1.add(a2.getL_Storage());
			
		}
		
//		System.out.println("loop");
//		Iterator<Integer>ite=f1.iterator();
//		while(ite.hasNext())
//		{
//			System.out.println(ite.next()); 
//		}
//		int first=f1.first();
		
		
		System.out.println("minimum storage in kb "+f1.first());
		System.out.println("max storage in kb "+f1.last());
		
		
		
		
		
		
		
		et.commit();
		
		

	}

}
