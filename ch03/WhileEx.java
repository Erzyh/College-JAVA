package ch03;

public class WhileEx {

	public WhileEx() {
		int sum=1, i=1;
		while(sum<50000) {
			System.out.println("I="+i+", Sum= "+sum);
			sum*=i;
			i++;
		}
		
	}
	
	public static void main(String[] args) {

		new WhileEx();
	}

}
