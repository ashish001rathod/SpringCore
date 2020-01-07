package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Address s= (Address) ctx.getBean("addr");
		
		//System.out.println(s.getAddress().getCity+" "+s.getStdname());


	}

}
