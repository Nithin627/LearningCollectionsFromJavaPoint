package com.nithin.List;

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {
	public static void main(String[] args) {

		/*
		 * The stack is the subclass of Vector. It implements the last-in-first-out data
		 * structure, i.e., Stack. The stack contains all of the methods of Vector class
		 * and also provides its methods like boolean push(), boolean peek(), boolean
		 * push(object o), which defines its properties.
		 */

		Stack<String> s = new Stack<String>();
		s.push("Nithin");
		s.push("Loki");
		s.push("Mani");
		s.pop();
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
