package seu.edu.cn.link;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements ApplicationContextAware, BeanNameAware, 
	InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> points;
	private Integer num;
	private ApplicationContext context = null; 
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw() {
		for(Point point : points){
			System.out.println("point: (" + point.getX() + ", " + point.getY() + ")");
		}
		System.out.println("====");
		System.out.println("pointA: (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("pointB: (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("pointC: (" + getPointC().getX() + ", " + getPointC().getY() + ")");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("bean name is :" + beanName);
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method is called");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposalBean destroy method is called");
	}
	
	public void myInit(){
		System.out.println("myInit init method is called");
	}
	public void cleanUp(){
		System.out.println("cleanUp method is called");
	}
}
