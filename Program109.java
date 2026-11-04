package com.tap.programming;

import java.util.ArrayList;
import java.util.Iterator;

public class Program109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList al = new ArrayList();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			al.add(60);
			Iterator itr = al.iterator();
//			traversing the arraylist
//			for(Object a:al) {
//				System.out.print(a+" ");
//			}
//			for(int i = 0 ;i<al.size();i++) {
//				System.out.print(al.get(i)+" ");
//			}
//			
			while(itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}
	}

}
