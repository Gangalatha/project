package cgginterns.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program created..." );
        
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
        //creating student object
        Student student=new Student();
        student.setId(5);
        student.setName("xyz");
        student.setCity("ampt");
        
        //creating address object
        Address ad=new Address();
        ad.setStreet("s1");
        ad.setCity("c1");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        
        //reading image file and storing in database
        
        try(FileInputStream fis=new FileInputStream("src/main/java/flowers.png"))
        {
        	byte [] data=new byte[fis.available()];
        	fis.read(data);
        	ad.setImage(data);
        }
        catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        catch(IOException e)
        {
        	e.printStackTrace();
        }
        Session session = factory.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.save(student);
        session.save(ad);
        
       
        
        tx.commit();
        
        
        
        
        session.close();
        factory.close();
        
        System.out.println("done....");
    }
}
