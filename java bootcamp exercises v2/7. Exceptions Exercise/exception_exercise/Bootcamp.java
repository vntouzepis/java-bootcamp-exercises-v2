package exception_exercise;
import java.util.Scanner;

public class Bootcamp {
public static void welcome(double num) throws DigitException,AnotherDigitException{
	if (num>25)
		{throw new DigitException();}
	else
		{throw new AnotherDigitException();}
}

public static int bye()  {
	try {welcome(299.7);}
	catch(DigitException e){return 605;}
	catch(AnotherDigitException e){return 230;}
	return 0;
}

public static void main(String[] argv) {
	double num;
	System.out.println("Give number:");
	Scanner sc=new Scanner(System.in);
	num=sc.nextDouble();
	
	try{
	welcome(num);}
	catch(DigitException e){
		System.out.println(e);}
	catch(AnotherDigitException e){
		System.out.println(e);}
	
		System.out.println(bye());
}}
