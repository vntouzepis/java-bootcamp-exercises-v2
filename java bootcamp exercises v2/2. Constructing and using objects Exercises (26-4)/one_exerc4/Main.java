/*
 * Convert exercise 1 array {1,2,3,4,5,6,7,8,9,10} and it's elements, from int, to Double. 
 * P.S. not double but Double. 
 */

package one_exerc4;

public class Main {

	public static void main(String[] args) {
		int [] pinax=new int[10];

		for (int i=0;i<10;i++){
			pinax[i]=i+1;
		}
		
		Integer [] pinaxnew=new Integer[10];
		Double [] pinaxnew1=new Double[10];
		for (int i=0;i<10;i++){
			pinaxnew[i]=new Integer(pinax[i]);
			double a=pinaxnew[i].doubleValue();
			pinaxnew1[i]=new Double(a);
			}
		
		for (int i=0;i<10;i++){
			System.out.println("pinaxnew1["+i+"]: "+pinaxnew1[i]);
			}
	//test
		System.out.print("pinaxnew1 instanceof Double[]: ");

		System.out.println(pinaxnew1 instanceof Double[]);
		
}}