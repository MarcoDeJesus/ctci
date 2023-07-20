public class SpaceComplexity{

	public static void main(String args[]){
		sum(Integer.parseInt(args[0]));
	}

	static int sum(int n){
		System.out.println(n);

		if(n <= 0){
			return 0;		
		}

		return sum(n - 1);
	}
}
