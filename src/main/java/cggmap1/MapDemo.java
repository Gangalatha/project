package cggmap1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//creating question object
		Question q1 = new Question();
		q1.setQuestion_id(1212);
		q1.setQuestion("what is java");
		
		//creating answer object
		Answer a1=new Answer();
		a1.setAnswer_id(343);
		a1.setAnswer("java is a programming language");
		
		q1.setAnswer(a1);
		
		Question q2 = new Question();
		q2.setQuestion_id(242);
		q2.setQuestion("what is collection framework");
		
		Answer a2=new Answer();
		a2.setAnswer_id(344);
		a2.setAnswer("api to work with group of objects");
		
		q2.setAnswer(a2);
		
		Session s=factory.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(q1);
		s.save(q2);
		
		s.save(a1);
		s.save(a2);
		
		tx.commit();
		
		//fetching objects based on question
		
		/*Question que=(Question)s.get(Question.class,1212);
		
		System.out.println(que.getQuestion());
		
		System.out.println(que.getAnswer().getAnswer());*/
		
		//fetching based on answer
		
		Answer ans=(Answer)s.get(Answer.class,344);
		
		System.out.println(ans.getAnswer());
		
		System.out.println(ans.getQuestion().getQuestion());
				
		s.close();
		
		factory.close();
	}

}
