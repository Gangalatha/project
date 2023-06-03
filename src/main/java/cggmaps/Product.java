package cggmaps;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Product {
	
	@Id
	@Column(name="product_id")
	private int productid;
	@Column(name="product_name")
	private String productname;
	
	@OneToMany
	@JoinColumn(name="b_id")
	List<Product> products;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product(int productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + "]";
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	
	

}
