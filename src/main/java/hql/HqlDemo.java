package hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import cgginterns.hibernate.Student;



public class HqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		//hql syntax
		
		String query="from student where city= :X";
		
		Query q = session.createQuery(query);
		
		q.setParameter("X", "hyd");
		
		//single result-(unique)
		//multiple result-we have use list
		
		List<Student> list = q.list();  
		
		for(Student s:list)
		{
			System.out.println(s.getName()+":"+s.getCity());
		}
		
		session.close();
		factory.close();
		

	}

}
