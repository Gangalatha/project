package cggmaps;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		//creating question object
		Question2 q1 = new Question2();
		q1.setQuestion_id(1212);
		q1.setQuestion("what is java");
		
		//creating answer object
		Answer2 a1=new Answer2();
		a1.setAnswer_id(343);
		a1.setAnswer("java is a programming language");
		a1.setQuestion(q1);
		
		Answer2 a2=new Answer2();
		a2.setAnswer_id(344);
		a2.setAnswer("java is platform independent");
		a2.setQuestion(q1);
		
		Answer2 a3=new Answer2();
		a3.setAnswer_id(345);
		a3.setAnswer("java is strongly typed lang");
		a3.setQuestion(q1);
		
		ArrayList<Answer2> list=new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
	
		q1.setAnswers(list);
		
		/*Question q2 = new Question();
		q2.setQuestion_id(242);
		q2.setQuestion("what is collection framework");
		
		Answer a2=new Answer();
		a2.setAnswer_id(344);
		a2.setAnswer("api to work with group of objects");
		
		q2.setAnswer(a2);*/
		
		Question2 q2 = new Question2();
		q2.setQuestion_id(234);
		q2.setQuestion("what is netbeans");
		
		//creating answer object
		Answer2 a4=new Answer2();
		a4.setAnswer_id(123);
		a4.setAnswer("netbeans is an ide");
		a4.setQuestion(q2);
		
		Answer2 a5=new Answer2();
		a5.setAnswer_id(124);
		a5.setAnswer("can build any type of app");
		a5.setQuestion(q2);
		
		Answer2 a6=new Answer2();
		a6.setAnswer_id(125);
		a6.setAnswer("very polpular");	
		a6.setQuestion(q2);
		
		ArrayList<Answer2> list1=new ArrayList<>();
		list1.add(a4);
		list1.add(a5);
		list1.add(a6);
		
	
		q2.setAnswers(list1);
		
		Session s=factory.openSession();
		
		Transaction tx=s.beginTransaction();
		
		s.save(q1);
		
		s.save(a1);
		s.save(a2);
		s.save(a3);
		
        s.save(q2);
		
		s.save(a4);
		s.save(a5);
		s.save(a6);
		
		tx.commit();
		
		//fetching objects based on question
		 
		/*Question que=(Question)s.get(Question.class,1212);
		
		System.out.println(que.getQuestion());
		
		System.out.println(que.getAnswer().getAnswer());*/
		
		//fetching based on answer
		
		/*Answer ans=(Answer)s.get(Answer.class,344);
		
		System.out.println(ans.getAnswer());
		
		System.out.println(ans.getQuestion().getQuestion());*/
		
		//Fetching o one to many
		
//		Question2 question=(Question2)s.load(Question2.class, 1212);
//		
//		System.out.println(question.getQuestion());
//		
//		
//		List<Answer2> answers=question.getAnswers();
//		
//		for(Answer2 answer:answers)
//		{
//			System.out.println(answer.getAnswer());
//		}
		
		
		
				
		s.close();
		
		factory.close();
	}

}
