package com.nithin.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> age = new ArrayList<Integer>();
		age.add(1);
		age.add(2);

		List<String> name = new LinkedList<String>();
		name.add("Nithin");
		name.add("Ram");
		name.add("Loki");

		List<String> list3 = new Vector<String>();
		List<Integer> list4 = new Stack<Integer>();

//		for (int ages : age) {
//			System.out.println(ages);
//		}

//		for (String names : name) {
//			System.out.println(names);
//		}

	}

}
