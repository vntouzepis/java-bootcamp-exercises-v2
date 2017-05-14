package data_structures_exercise2;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
	
    public static Stack<Integer> reverse(Stack<Integer> initial) {
        Stack<Integer> newstack = new Stack<>();
        int length=initial.size();
        for (int i=0;i<length;i++){
        	Integer var=initial.pop();
        	newstack.push(var);}
        return newstack;}

	public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();	
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
        System.out.println("initial stack: " + myStack);
       System.out.println("reversed stack: " + reverse(myStack));
	}}
