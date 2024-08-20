package com.nithin.List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {

		/*
		 * LinkedList implements the Collection interface. It uses a doubly linked list
		 * internally to store the elements. It can store the duplicate elements. It
		 * maintains the insertion order and is not synchronized. In LinkedList, the
		 * manipulation is fast because no shifting is required.
		 */

		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Moon");
		list1.add("Sun");
		list1.add("Mars");
		list1.add("Venus");
		list1.add("Mercury");
		list1.add("Earth");
		list1.add("Jupiter");
		list1.add("Saturn");
		list1.add("Uranus");
		list1.add("neptune");
		list1.add("Pluto");

		list1.add("Moon");
		list1.add("Sun");
		list1.add("Mars");
		list1.add("Venus");
		list1.add("Mercury");
		list1.add("Earth");
		list1.add("Jupiter");
		list1.add("Saturn");
		list1.add("Uranus");
		list1.add("neptune");
		list1.add("Pluto");

		Iterator<String> itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
