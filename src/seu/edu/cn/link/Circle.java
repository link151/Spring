package seu.edu.cn.link;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component("shape")
public class Circle implements Shape{
	private Point center;
	@Autowired
	private MessageSource messageSource;

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("drawing.circle", null, "***default drawing circle***", null));
		System.out.println(messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "***default drawing point***", null));
		System.out.println(messageSource.getMessage("greeting", null, "***default greeting***", null));
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("Init Circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy Circle");
	}
	
}
