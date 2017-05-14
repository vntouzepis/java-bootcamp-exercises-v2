import java.util.*;
public class Exercise6{
	public static void main (String[] argv){
		System.out.print("Enter Tax Identification Number: ");
Scanner sc = new Scanner(System.in);
     String alfar = sc.next();

    String alfar1=alfar.substring(0,8);
    char[] pinax=new char[8];
    for (int i=0;i<8;i++){
    	pinax[i]=alfar1.charAt(i);
    }
    int[] pinax_aker=new int[8];

    for (int i=0;i<8;i++){
    	pinax_aker[i]=Character.getNumericValue(pinax[i]);
    }

    int sum=0;
    int num=1;
    for (int i=0;i<8;i++){
    	num=num*2;
    	sum=sum+pinax_aker[7-i]*num;
    	}

	sum=(sum%11);
	sum=(sum%10);

    String alfar2=alfar.substring(8,9);
    char digit=alfar2.charAt(0);
	int tel_dig=Character.getNumericValue(digit);

if (sum==tel_dig)
{System.out.println("Tax Identification Number valid.");
}
else
{System.out.println("Tax Identification Number not valid.");
}

     }
	}