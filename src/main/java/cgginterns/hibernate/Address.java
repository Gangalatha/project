package cgginterns.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Student_address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="address_id")
	private int addressid;
    
    @Column(name="STREET",length=50)
	private String street;
    
    @Column(name="CITY",length=100)
	private String city;
    
    @Column(name="is_open")
	private boolean isOpen;
    
   @Transient
	private double x;
    
    @Column(name="added_date")
    @Temporal(TemporalType.DATE)
	private Date addedDate;
    
    @Type(type="org.hibernate.type.BinaryType")
    private byte[] image;
     
    
	public Address() {
		super();
		// TODO Auto-generated constructor stub\
	}
	 
	public Address(int addressid, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	
}
