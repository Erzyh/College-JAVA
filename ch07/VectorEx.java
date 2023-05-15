package ch07;

import java.util.Collections;
import java.util.Vector;

public class VectorEx {

	public VectorEx() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(34);
		v.add(45);
		v.add(27);
		v.add(11);
		v.add(1, 55);
		v.add(7);
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		// v.remove(1);
		System.out.println(v.contains(new Integer(55)));
		
		Collections.sort(v);
		System.out.println(v);
		
		int sum = 0;
		for(int num:v) {
			sum+=num;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		new VectorEx();
	}

}
