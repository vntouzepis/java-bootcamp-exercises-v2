import java.util.*;
public  class Exercise8{
	public static void main(String[] argv){
		System.out.print("Enter 10 digit number: ");

Scanner sc = new Scanner(System.in);

    String alfar= sc.next();

	 char[] alfar1=alfar.toCharArray();
for (int j=0;j<10;j=j+2){
	System.out.print(alfar1[j]+" ");
	 }
	 System.out.println(" ");

	 for (int j=1;j<10;j=j+2){
	 	System.out.print(" "+alfar1[j]);
	 }
	 System.out.print("\n");

}}