import java.util.*;
public  class Exercise9{
	public static void main(String[] argv){
		System.out.print("Enter 9 digit number: ");

Scanner sc = new Scanner(System.in);

    String alfar= sc.next();

	 char[] alfar1=alfar.toCharArray();
for (int j=0;j<9;j=j+3){
	System.out.print(alfar1[j]+"  ");
	 }
	 System.out.println("");
System.out.print(" ");
	 for (int j=1;j<9;j=j+3){
	 System.out.print(alfar1[j]+"  ");
	 }
	 System.out.print("\n");
	 System.out.print("  ");

for (int j=2;j<9;j=j+3){
		System.out.print(alfar1[j]+"  ");
	 }
	 System.out.print("\n");
}}