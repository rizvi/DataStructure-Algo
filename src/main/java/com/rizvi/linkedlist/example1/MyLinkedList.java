package com.rizvi.linkedlist.example1;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String args[]) {

		LinkedList<String> al = new LinkedList<String>();
		al.add("Abu Bakkar");
		al.add("Omar");
		al.add("Usman");
		System.out.println("Current list: ");
		showList(al);
		System.out.println("========================");

		System.out.println("After adding Mohammad in the first position: ");
		al.addFirst("Mohammad");
		showList(al);
		System.out.println("========================");

		System.out.println("After adding Ali in the last position: ");
		al.addLast("Ali");
		showList(al);
		System.out.println("========================");

		System.out.println("Size of list: " + al.size());

		System.out.println("Check Usman is exists in the list or not: " + al.contains("Usman"));

		System.out.println("Remove Usman from the list: " + al.remove("Usman"));
		System.out.println("Current list: ");
		showList(al);
		System.out.println("========================");

		System.out.println("First position in the list: " + al.getFirst());
		System.out.println("Last position in the list: " + al.getLast());

		System.out.println("Index position of [Abu Bakkar] in the list: " + al.indexOf("Abu Bakkar"));
		System.out.println("Index position of [Ali] in the list: " + al.lastIndexOf("Ali"));
	}

	public static void showList(LinkedList<String> al) {
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
