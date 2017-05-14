import java.util.*;
public  class Exercise7{
	public static void main(String[] argv){
		System.out.print("Enter binary number: ");
int index=0;
Scanner sc = new Scanner(System.in);

    String alfar= sc.next();

	  char[] alfar1=alfar.toCharArray();

  for (int j=0;j<7;j++){
	if (alfar1[j]=='1')
	   index=index+1;
	 }

if ((index==1&&alfar1[7]=='1')||(index==3&&alfar1[7]=='1')||(index==5&&alfar1[7]=='1')||(index==7&&alfar1[7]=='1')||(index==0&&alfar1[7]=='0')||(index==2&&alfar1[7]=='0')||(index==4&&alfar1[7]=='0')||(index==6&&alfar1[7]=='0'))
				System.out.println("Parity check OK.");
			    else
					System.out.println("Parity check not OK.");


}}