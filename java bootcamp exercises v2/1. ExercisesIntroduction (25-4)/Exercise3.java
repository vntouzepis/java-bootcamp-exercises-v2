import java.util.Scanner;
public class Exercise3{
	public static void main(String[] argv){
Scanner sc=new Scanner(System.in);

System.out.print("Enter value for a: ");
double a=sc.nextDouble();
System.out.print("Enter value for b: ");
double b=sc.nextInt();
System.out.print("Enter value for c: ");
double c=sc.nextInt();
double diakrinousa=b*b-4*a*c;
if (diakrinousa>=0){
	double riza1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
	System.out.println("1st root: "+ riza1);
double riza2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
	System.out.println("2nd root: "+ riza2);}
else
{System.out.println("no real-valued solutions exist");}

}}