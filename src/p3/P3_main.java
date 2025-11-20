package p3;

public class P3_main { 
	public static void main ( String [] args) {
		
		int [] [] a = { {1,2,3},
						{4,5,6},
						{7,8,9}};
		
		
		// Teil a)
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i] [j] += 1;
				System.out.println(a[i][j]);
			}
			System.out.println();
		} 
		System.out.println();
		
		int [] [] b = { {1,2,3},
						{4,5,6},
						{7,8,9}};
		
		// Teil b)
		int summe = 0;
		for (int i = 0; i< b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				summe += b[i][j];
			}
		} System.out.println(summe);
		System.out.println();
		
	}
}

