
import java.util.Scanner;
public class Exercise2{
public static void main(String[] argv){


	System.out.print("Enter number of 50 euro banknotes: ");
	Scanner sc = new Scanner(System.in);
     int i = sc.nextInt();


	System.out.print("Enter number of 20 euro banknotes: ");
	     int j = sc.nextInt();

	System.out.print("Enter number of 10 euro banknotes: ");
	     int k = sc.nextInt();
	System.out.print("Enter number of 5 euro banknotes: ");
	     int l = sc.nextInt();
	System.out.print("Enter number of 2 euro banknotes: ");
	     int m = sc.nextInt();
	System.out.print("Enter number of 1 euro banknotes: ");
	     int n = sc.nextInt();

int sum=50*i+20*j+10*k+5*l+2*m+1*n;
	System.out.println("You have "+sum+" euros.");






}

}