package interfaces_exercise1;

public class Circle implements Shape{
	protected double radius;
	
	public static final double PI=3.14;

	public Circle(){
		
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
	public double getParameter(){
		return this.radius;
	}
	
	public double getArea(){
		return this.radius*this.radius*PI;
	}
	
}
