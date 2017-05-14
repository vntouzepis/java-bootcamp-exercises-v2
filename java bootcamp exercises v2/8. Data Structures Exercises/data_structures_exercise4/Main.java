package data_structures_exercise4;
import java.util.*;

public class Main {
	public static void main(String[] argv){
	
	System.out.println("give word:");
	Scanner sc=new Scanner(System.in);
	String alfar=sc.next();
	
	char[] pinax=alfar.toCharArray();
	
	
	String[] alfar_pin=new String[alfar.length()];
	for (int i=0;i<alfar.length();i++){
	alfar_pin[i]=String.valueOf(pinax[i]);	}
	
	
	ArrayList<String> ar1=new ArrayList<String>(Arrays.asList(alfar_pin));

	
			System.out.println(ar1);

	
		ArrayList<String> ar2=new ArrayList<String>(Arrays.asList(alfar_pin));
	for (int i=0;i<ar2.size();i++){
			ar2.set(i, ar1.get(ar1.size()-i-1));}
	
	System.out.println(ar2);

	
if (ar1.equals(ar2))
	System.out.println("given word is a palindrome");
else
	System.out.println("given word is not a palindrome");	



}}
