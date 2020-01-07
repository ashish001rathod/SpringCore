package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerAppln {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("annotations/SpringAnnot.xml");
		Customer c=  (Customer) ctx.getBean("cust",Customer.class);
		System.out.println(c.getCode()+" "+c.getName());
	}

}
