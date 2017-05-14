package interfaces_exercise1;

import java.util.Scanner;

public class ResizableCircle extends Circle implements Resizable{
	public ResizableCircle(double radius){
		super(radius);
		
	}
	public void resize(double given_percentage){
		radius=super.radius*given_percentage;
		
	}}


 class Main{
	public static void main(String[] argv){
		System.out.println("Give radius:");
		Scanner sc=new Scanner(System.in);
		double i=sc.nextDouble();
		ResizableCircle c=new ResizableCircle(i);
		System.out.println("Modify the radius by the given percentage:");
		double j=sc.nextDouble();
		c.resize(j);
		System.out.println("Area of the circle is:");
		System.out.println(c.getArea());

	}
}