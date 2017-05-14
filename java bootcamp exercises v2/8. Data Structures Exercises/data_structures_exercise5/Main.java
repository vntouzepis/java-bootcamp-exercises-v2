package data_structures_exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		
		
		Integer[] array1={1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
		
		
		findMinAndPositions(array1);

}

	

	public static void findMinAndPositions(Integer[]  array1) {
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>(Arrays.asList(array1));

		ArrayList<Integer> arrayList1=new ArrayList<Integer>();

		Object min= Collections.min(arrayList);
		
		
		for (int i=0;i<arrayList.size();i++){
			if (min==arrayList.get(i))
				arrayList1.add(i);}
		
		System.out.print("Min is "+min+ " in positions: ");
		System.out.println(arrayList1);
		
	
	}
}

		
		
		
	
