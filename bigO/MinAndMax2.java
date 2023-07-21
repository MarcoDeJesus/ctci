public class MinAndMax2{

	public static void main(String [] args){

		int numbers [] = new int [args.length];

		for(int i=0; i < args.length; i++){
			System.out.println(args[i]);
			numbers[i] = Integer.parseInt(args[i]);
		}

		minMaxFunction(numbers);
	}

	static void minMaxFunction(int [] array){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int x : array){
			if(x < min) min = x;
		}

		for(int x : array){
			if(x > max) max = x;
		}
		System.out.println("The minimum number is: " + min);	
		System.out.printf("The maximum number is: %d", max);
	}
}
