package cggmaps;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Brand {
	
	@Id
	@Column(name="brand_id")
	private int brandid;
	@Column(name="brand_name")
	private String brandname;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(int brandid, String brandname) {
		super();
		this.brandid = brandid;
		this.brandname = brandname;
	}
	@Override
	public String toString() {
		return "Brand [brandid=" + brandid + ", brandname=" + brandname + "]";
	}
	public int getBrandid() {
		return brandid;
	}
	public void setBrandid(int brandid) {
		this.brandid = brandid;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	
	

}
