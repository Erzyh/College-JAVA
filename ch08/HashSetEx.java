package ch08;

import java.util.*;

public class HashSetEx {

	HashSet<Integer> CorrectNum = new HashSet<Integer>(Arrays.asList(3, 15, 37, 23, 41, 7));
	HashSet<Integer> lotto = new HashSet<Integer>();
	HashSet<Integer> checkNum = new HashSet<Integer>();
	
	public HashSetEx() {
		Random r = new Random();
		
		checkNum.addAll(CorrectNum);			
			
		while (lotto.size() < 6) {
			lotto.add(r.nextInt(1, 46));
		}
		
		checkNum.retainAll(lotto);
		
		// 출력
		System.out.println(CorrectNum);
		System.out.println(lotto);
		System.out.println("유사도: " + checkNum + " \n정확성: " + checkNum.size());
	}
	
	public static void main(String[] args) {
		new HashSetEx();
	}

}
