package three_exerc1;

public class Circle {
	public static int numberOfCreatedCircles; 
	public static final double pi=3.14;
	private int x;
	private int y;
	private int r;

public Circle(){
	this.x=0;
	this.y=0;
	this.r=5;
	numberOfCreatedCircles+=1;
}

public Circle(int x,int y,int r){
	this.x=x;
	this.y=y;
	this.r=r;
	numberOfCreatedCircles+=1;

}

public Circle(int x,int y){
	this();
	this.x=x;
	this.y=y;
}

public Circle(Circle c){
	this.x=c.x;
	this.y=c.y;
	this.r=c.r;
	numberOfCreatedCircles+=1;

}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getR() {
	return r;
}

public void setR(int r) {
	this.r = r;
}

public void printCircleDetails(){ 
System.out.println("* I'm a circle at point ("+x+","+y+") with radius "+r);}

public double calculateArea(){
	return pi*r*r;}

public double calculatePerimeter(){
	return 2*pi*r;}

public boolean cocentric(Circle c1,Circle c2) {
	System.out.print("check if two circles share the same centre: ");
	if ((c1.x==c2.x)&&(c1.y==c2.y))
	return true;
	else
		return false;
}

}
