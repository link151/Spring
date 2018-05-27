package seu.edu.cn.link;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApplication {

	public static void main(String[] args) {

		File file = new File("spring.xml");
		if(file.exists()){
			System.out.println("Exists");
		}
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = (Triangle) factory.getBean("triangle");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("shape");
		shape.draw();
		//首先获取bean，再使用bean获取message，默认的是根据name获取bean 【messageSource】
//		MessageSource sourceMessage = (MessageSource) context.getBean("sourceMessage"); 
//		System.out.println(sourceMessage.getMessage("greeting", null, "***default greeting***", null));

		//默认的是根据name获取bean 【messageSource】
//		System.out.println(context.getMessage("greeting", null, "***default greeting***", null));
		
	}

}
