package test;

import java.util.ArrayList;

public class TsetArray_01 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>(3);
		a.add(32);
		a.add(4);
		a.add(3);
		a.add(5);
		System.out.println(a);
		System.out.println(a.get(a.size()));
	}

}
