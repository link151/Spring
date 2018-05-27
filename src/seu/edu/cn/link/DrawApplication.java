package seu.edu.cn.link;

import java.io.File;

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

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape shape = (Shape) context.getBean("shape");
		shape.draw();
		
		
	}

}
