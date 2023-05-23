package ch08;

import java.util.*;

public class ArrayListEx {
	
	public ArrayListEx() {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		while(!str.equals("quit")) {
			list.add(str);
			str = sc.nextLine();
		}
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			str = it.next();
			System.out.println(str);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String s:list) {
			System.out.println(s);
		}
		
		sc.close();
		
	}
	public static void main (String[] args) {
		new ArrayListEx();
	}
}
