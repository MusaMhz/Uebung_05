package h2;

public class H2_main {
	public static void main ( String[] args) {
		int n =299;
		int digits = 0;
		int [] a = new int[9];
		int Zahl = n;
		int index = 8;
		
		if (Zahl == 0) {
			digits = 1;
			System.out.println(digits);
		} else {
			while (Zahl != 0) {
				Zahl = Zahl / 10;
				digits ++;
			} System.out.println("Die Anzahl der Ziffer beträgt: "+digits);
			
		int z = n;
		
		while (z != 0 && index >= 0) {
			a [index] = z % 10;
			z = z / 10;
			index --;
			
		}
		
		System.out.println();
		System.out.println("Array a:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        
		}
		
		
		
	}

}
