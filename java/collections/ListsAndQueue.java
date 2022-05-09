package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class ListsAndQueue {

	public static void main(String[] args) {

		System.out.println("=====================");
		System.out.println("ARRAY LISTS");
		System.out.println("_____________________");
		// only for String Elemnets
		ArrayList<String> as = new ArrayList<String>();
		as.add("Teja");
		as.add("Sriinu");
		as.add(1, "blessy");
		as.add(0, "mercy");
		for (String str : as) {
			System.out.println(str);
		}
		System.out.println();
		Iterator<String> itr = as.iterator();
		
		  while(itr.hasNext())
		  { 
			  System.out.println(itr.next()); 
		  }
		  System.out.println();
		  as.remove(3);
		  for(String s : as)
		  {
			  System.out.println(s);
		  }
		  System.out.println("=====================");
		  System.out.println("LinkedList and Vector are also same as ArrayList");
		  
		  System.out.println("=====================");
		  System.out.println("QUEUE");
		  System.out.println("_____________________");
		  PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		  for(int i=10;i>0;i--)
		  {
			  pq.add(i);                   //inserts 10,9,8,7,6,5,4,3,2,1
		  }
		  int x = pq.peek();
		  System.out.println(x+"\n");
		  @SuppressWarnings("unused")
		int y = pq.poll();
		  Iterator<Integer> it = pq.iterator();
		  while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
