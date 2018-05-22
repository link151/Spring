package seu.edu.cn.link;

import java.io.File;

import javax.security.auth.login.Configuration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawApplication {

	public static void main(String[] args) {

		File file = new File("spring.xml");
		if(file.exists()){
			System.out.println("Exists");
		}
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle = (Triangle) factory.getBean("triangle");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
	}

}
