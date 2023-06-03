package cgginterns.hibernate;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setEmpName("abc");
		
		Employee emp1=new Employee();
		emp1.setEmpId(2);
		emp1.setEmpName("def");
		
		Project pro=new Project();
		pro.setProjectId(11);
		pro.setProjectName("library management");
		
		Project pro1=new Project();
		pro1.setProjectId(12);
		pro1.setProjectName("chat bot");
		
		ArrayList<Employee> list1=new ArrayList<Employee>();
		list1.add(emp);
		list1.add(emp1);
		
		ArrayList<Project> list2=new ArrayList<Project>();
		list2.add(pro);
		list2.add(pro1);
		
		emp.setProject(list1);
		emp.setProject(emp1);
		

	}

}
