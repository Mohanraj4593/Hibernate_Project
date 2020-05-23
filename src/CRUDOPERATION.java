import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDOPERATION {
public static void main(String[] arg) 
{
SessionFactory sf=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Customer_Details.class).buildSessionFactory();	
Session session=sf.openSession();

Transaction t=session.beginTransaction();
Customer c=session.get(Customer.class,3);
System.out.println(c);
session.delete(c);



t.commit();
session.close();
sf.close();
}
}
