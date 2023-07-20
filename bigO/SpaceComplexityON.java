public class SpaceComplexityON{
	public static void main (String [] args){
		pairSumSequence(Integer.parseInt(args[0]));
	}

	static int pairSumSequence(int n){

		int sum = 0;

		for(int i = 0; i < n; i++){
			System.out.println("Current n value is: " + n 
				+ "\nCurrent sum value is: " + sum);
			sum += pairSum(i, i + 1);
		}

		return sum;
	}

	static int pairSum(int a, int b){
		return a + b;
	}
}
