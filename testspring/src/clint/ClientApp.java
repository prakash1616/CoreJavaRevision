package clint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Adress;
import beans.Employee;

public class ClientApp {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	
	Employee employee =context.getBean("emp",Employee.class);
	employee.getId();
	Adress add =context.getBean("add",Adress.class);
	add.getName();
	add.getAdress();
	
	
	
	
	
	
	
	
}
}
