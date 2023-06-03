package cgginterns.hibernate;

import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		
		Session session=factory.openSession();
		
		//Student s=session.load(Student.class, 5);
		
		//System.out.println(s);
		
		//fetching address data
		Address addr=(Address)session.load(Address.class, 1);
		//Address addr1=(Address)session.load(Address.class, 1);
        //System.out.println(addr);
		
		//System.out.println(addr.getStreet()+":"+addr.getCity());
		//System.out.println(addr1.getStreet()+":"+addr1.getCity());
        
        //fetching image
        
        byte[] image = addr.getImage();
        
        try(FileOutputStream fos=new FileOutputStream("src/main/java/fetchedimage.png"))
        {
        	fos.write(image);
        	fos.flush();
        }
        catch(IOException e)
        {
        	e.printStackTrace();
        }

		session.close();
		factory.close();
		

	}

}
