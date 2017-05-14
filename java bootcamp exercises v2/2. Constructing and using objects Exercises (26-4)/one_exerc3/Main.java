/*
 *  Create an array that can receive 10 elements, as a size, 
 *  and add in each position an element starting from 1 to 10 statically and print the array. 
 *  Afterwards, create a method (function) that can shift the array elements right by 10 times. 
 *  The 10 is given by the user as an input. At the end print the shifted array. 
 *  Exercise 3 result

[10, 1, 2, 3, 4, 5, 6, 7, 8, 9]
[9, 10, 1, 2, 3, 4, 5, 6, 7, 8]
[8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
[7, 8, 9, 10, 1, 2, 3, 4, 5, 6]
[6, 7, 8, 9, 10, 1, 2, 3, 4, 5]
[5, 6, 7, 8, 9, 10, 1, 2, 3, 4]
[4, 5, 6, 7, 8, 9, 10, 1, 2, 3]
[3, 4, 5, 6, 7, 8, 9, 10, 1, 2]
[2, 3, 4, 5, 6, 7, 8, 9, 10, 1]
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

 */

package one_exerc3;
public class Main {

public static void main(String[] args) {
int [] pinax=new int[10];
int [] pinax2=new int[10];

for (int i=0;i<10;i++){
	pinax[i]=i+1;
	}
for (int i=0;i<10;i++){
	pinax2[i]=i+1;
	}

for (int k=0;k<=9;k++){

for (int i=0;i<10;i++){

	if (i==0)
	{pinax[i]=pinax2[9];}
	else
	{pinax[i]=pinax2[i-1];

	}
	if (i==0)
	{System.out.print("["+pinax[i]+",");}
	else if (i<9)
	{System.out.print(+pinax[i]+",");}
	else
		{System.out.print(+pinax[i]+"]");}
	}
System.out.println();
	for (int j=0;j<10;j++){
			pinax2[j]=pinax[j];
	}}
	
}}
