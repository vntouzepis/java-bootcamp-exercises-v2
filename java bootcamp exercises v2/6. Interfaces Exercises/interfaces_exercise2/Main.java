package interfaces_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Give height of first shape:");
		Scanner sc=new Scanner(System.in);
		int i1=sc.nextInt();
		System.out.println("Give width of first shape:");
		int i2=sc.nextInt();
		Shape s1=new Shape(i1,i2);
		System.out.println("Give height of second shape:");
		int i3=sc.nextInt();
		System.out.println("Give width of second shape:");
		int i4=sc.nextInt();
		Shape s2=new Shape(i3,i4);		
		
s1.isSmallerThan(s2);
	}

}
