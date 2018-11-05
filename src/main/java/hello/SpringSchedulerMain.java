package hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSchedulerMain {

	public static void main(String[] args) throws Exception  {		
			@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:springmvc.xml");
			context.start();	
	}
}
