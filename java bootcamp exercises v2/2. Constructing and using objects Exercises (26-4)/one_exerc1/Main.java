/*
* Create a static function, with the name "bootCamp",
*that receives as an input two int arguments,
*i.e., number1 and number2, and returns an int result in the end. 
*If "number1" is smaller that "number2" then returns the square root (use Math.sqrt method) 
*of the absolute value (use Math.abs) of the difference among "number1" and "number2". 
*Else return the sum of the two numbers.
*Number1 = 25, Number2 = 91
*Number1 = 91, Number2 = 25
*/

package one_exerc1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Integer a=new Integer(JOptionPane.showInputDialog(null, "Enter number1:"));
		Integer b=new Integer(JOptionPane.showInputDialog(null, "Enter number2:"));
		int num1=a.intValue();
		int num2=b.intValue();
		
JOptionPane.showMessageDialog(null, "Result is: "+bootCamp(num1,num2));
	}

public static int bootCamp(int a,int b){
	
	if (a<b)
	{	return (int)Math.sqrt(Math.abs(a-b));
}
	else
	{return (a+b);}
	
}}


