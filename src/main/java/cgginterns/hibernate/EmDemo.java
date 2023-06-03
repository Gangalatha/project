package cgginterns.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//create student object
		Student student=new Student();
		student.setId(101);
		student.setName("abc");
		student.setCity("hyd");
		
		//creating certificate objects
		
		Certificate certi=new Certificate();
		certi.setCourse("hibernate");
		certi.setDuration("3 months");
		
		student.setCerti(certi);
	    System.out.println(student);
		
		Session session = factory.openSession();

		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		factory.close();
	}

}
