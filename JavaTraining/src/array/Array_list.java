package array;

import java.util.*;

public class Array_list {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Chinmay");
		System.out.println(l);
		l.add(10);
		l.add("Tare");
		l.add("B");
		l.add("A");
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"B");
		System.out.println(l);
	}

}
