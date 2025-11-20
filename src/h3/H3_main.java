package h3;

public class H3_main {
		public static void main ( String [] args) {
			
			int [][] einheiten = new int [2] [15];
			
			einheiten [0] = new int [] {50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1};
			
			int input = 12019;
			int Geld = input;
		
	        for (int i = 0; i < einheiten[0].length; i++) {
	             if (einheiten[0] [i] <= Geld) {
	            	 int anzahl = Geld / einheiten[0][i];
	            	 einheiten [1][i] = anzahl;
	            	 Geld = Geld - anzahl * einheiten[0][i];
	             }
	                
	            
	       
	        }
	        
	        System.out.println(input + " Cent");
	        System.out.println("Aufteilung :");
	        for (int i = 0; i < einheiten[0].length; i++) {
	            System.out.println(einheiten[0][i] + " Cent -> " + einheiten[1][i]);
	        }
	        System.out.println("Rest: " + Geld + " Cent");
		}
}
