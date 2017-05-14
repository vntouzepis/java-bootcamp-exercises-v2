package interfaces_exercise2;

import java.util.Scanner;

public class Shape implements Agreeable{
	private int width;
	private int height;
	
	
	public Shape() {
		super();
	}


	public Shape(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	@Override
	public String toString() {
		return "Shape [width=" + width + ", height=" + height + "]";
	}
	
public int calcArea(){
	return this.width*this.height;
}


public void isSmallerThan(Agreeable other){	
	this.calcArea();
	if (other instanceof Shape){
Shape a=(Shape)other;
if (this.calcArea()>a.calcArea())
	System.out.println("First shape is bigger than second");
	else if(this.calcArea()<a.calcArea())
		System.out.println("First shape is smaller than second");
	else if(this.calcArea()==a.calcArea())
		System.out.println("Shapes have the same area");
	}
}

}
