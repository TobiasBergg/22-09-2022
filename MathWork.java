import java.util.Random;

class MathWork{
	
	static int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };

	public static void main(String [] args){

		divisible(25);
		System.out.println("Random nummer: " +getRandom(arr));
		recursiveInt(10);

	}

	public static void divisible(int a){

		int [] array;
		array = new int[100];
		
		for(int i = 0; i<=100; i++){

		//System.out.println(i%a);
			
		int k = i%a;
		
		if(k == 0){
		System.out.println(k);
		System.out.println(i);
		}
	}
}

	public static int getRandom(int[] arr){
		int rnd = new Random().nextInt(arr.length);

		return arr[rnd];


	}

	public static void recursiveInt(int a){

		System.out.println(a);
		if(a > 0){
			recursiveInt(a-1);
		}
	}
}