package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans/SpringCore.xml");
		Employee e=  (Employee) ctx.getBean("emp");
		Employee e1=  (Employee) ctx.getBean("emp");
		//e.setEmpCode(111);
		e.setEmpName("ASHISH");
		e.setSalary(5000);
System.out.println(e.getEmpCode()+" "+e.getEmpName()+" "+e.getSalary()+" "+e.getSkills());
		System.out.println(e1.getEmpCode()+" "+e1.getEmpName()+" "+e1.getSalary()+" "+e.getSkills());

	}

}
