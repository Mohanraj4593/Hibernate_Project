import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customrer_details_id")
	private Customer_Details customerdetails;
	
	Customer(String name)
	{
		this.name=name;
	}
	Customer(){}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setCustomer_Details(Customer_Details customerdetails) 
	{
		 this.customerdetails=customerdetails;
	}
	
	public Customer_Details getCustomer_Details() 
	{
		return customerdetails;
	}
	

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}

	
}
