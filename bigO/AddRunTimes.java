public class AddRunTimes{

	public static void main(String args[]){

		int arrayA [] = {5, 23, 66, 33};
		int [] arrayB = new int[4];
		arrayB[0] = 32;
		arrayB[1] = 772;
		arrayB[2] = 90;
		arrayB[3] = 2444;

		System.out.println("First Array");
		for(int a : arrayA){
			System.out.println(a);
		}

		System.out.println("\nSecond Array");
		for(int b : arrayB){
			System.out.println(b);
		}
	}
}
