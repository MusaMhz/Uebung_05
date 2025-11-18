package p2;

public class P2_main {
	public static void main ( String [] args) {
		int[] numbers = {1,2,3,4,5};
		int max = numbers[0];
		int minIndex = 0; 
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max){
				max = numbers[i];
				minIndex = i;
			}
			
		} 
		System.out.println("max:" +max);
		System.out.println("minIndex:" +minIndex);
		
	}

}
