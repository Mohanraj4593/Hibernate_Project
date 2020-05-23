import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer_Details {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int customer_details_id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private int phone;
	
	//private Customer customer;
	
	Customer_Details(String email,int phone)
	{
		this.email=email;
		this.phone=phone;
	}
	
	Customer_Details(){}
	
	public int getId() {
		return customer_details_id;
	}

	public void setId(int id) {
		this.customer_details_id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

}
