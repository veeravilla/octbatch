package com.test.util;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {

	  public static void main(String args[]) {
	    Stack<Object> st = new Stack();
	    System.out.println("stack: " + st);
	    st.push(new Integer(42));
	    System.out.println("push(" + 42 + ")");
	    System.out.println("stack: " + st);

	    System.out.print("pop -> ");
	    Integer a = (Integer) st.pop();
	    System.out.println(a);
	    System.out.println("stack: " + st);

	    try {
	      st.pop();
	    } catch (EmptyStackException e) {
	      System.out.println("empty stack");
	    }
	  }

}
