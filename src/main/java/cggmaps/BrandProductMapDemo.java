package cggmaps;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BrandProductMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//creating brand
		
		Brand brand=new Brand();
		brand.setBrandid(1);
		brand.setBrandname("tata");
		
		Product product=new Product();
		product.setProductid(11);
		product.setProductname("tata car");
		
		Product product1=new Product();
		product1.setProductid(11);
		product1.setProductname("tata salt");
		
		Product product2=new Product();
		product2.setProductid(11);
		product2.setProductname("tata clothes");
		
		
		ArrayList<Product> products=new ArrayList<>();
		
		products.add(product);
		products.add(product1);
		products.add(product2);
		
	}

}
