
/*
 * Create a program that simulates the roll of two dices. 
 * The program must execute till both dices return 1 as a result (use Math.random). 
 * You can create a class name Dice which has a void roll method. 
 * Roll method is rolling the dices till the needed results 
 * is aquired and prints the number of rolls needed in order to have two 1s. 
 */

package one_exerc2;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Zari no1=new Zari();
		Zari no2=new Zari();
		int a;
		int b;
		int i=0;

		do {
			 a=no1.roll();
			 //System.out.println("zari1: "+a);
			 b=no2.roll();
			// System.out.println("zari2: "+b);
			 i++;}
		
		while((a!=1)||(b!=1));

		 System.out.println("dice 1 final: "+a);
		 System.out.println("dice 2 final: "+b);
		 System.out.println("number of rolls needed in order to have two 1s: "+i);
	}}
		