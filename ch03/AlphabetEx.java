package ch03;

public class AlphabetEx {
	
	public AlphabetEx() {
		char ch;
		ch = '가';
				
		for(int i = 0; i < 11172; i++) {
			System.out.print((char)(ch+i));
			if ((i+1)%30 == 0)
				System.out.println();
		}
		
	}

	public static void main(String[] args) {
		new AlphabetEx();

	}

}
