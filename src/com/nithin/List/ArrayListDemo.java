package com.nithin.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {

		/*
		 * The ArrayList class implements the List interface. It uses a dynamic array to
		 * store the duplicate element of different data types. The ArrayList class
		 * maintains the insertion order and is non-synchronized. The elements stored in
		 * the ArrayList class can be randomly accessed. Consider the following example.
		 */

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Nithin");
		list1.add("Loki");

		Iterator<String> itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
