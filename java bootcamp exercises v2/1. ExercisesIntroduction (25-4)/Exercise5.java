import java.util.Scanner;
public class Exercise5{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of pronic numbers: ");
int num=sc.nextInt();
int ar=0;
for(int i=1;i<=num;i++){
	ar=i*(i+1);
	System.out.print(ar+" ");}
	System.out.print("\n");
}}