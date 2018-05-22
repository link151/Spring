package seu.edu.cn.link;

import java.io.File;

import org.springframework.context.ApplicationContext;
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
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
		System.out.println("num:" + triangle.getNum());
		triangle.setNum(triangle.getNum()+1);
		triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
		System.out.println("num:" + triangle.getNum());
		
	}

}
