package seu.edu.cn.link;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("shape")
public class Circle implements Shape{
	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointB")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println("Draw Circle");
		System.out.println("center point: (" + center.getX() + ", " + center.getY() + ")");
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
