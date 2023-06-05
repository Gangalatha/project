package states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Student s1=new Student();
		s1.setId(101);
		s1.setName("abc");
		s1.setCity("hyd");
		
		Certificate certi=new Certificate();
		certi.setCourse("hibernate");
		certi.setDuration("1 month");
		
		s1.setCerti(certi);
		
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(s1);
		
		tx.commit();
		
		session.close();
		
		
		

	}

}
