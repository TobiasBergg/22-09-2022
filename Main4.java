class Main4{
	
	public static void main(String [] args){

		fibonacci(1,1);
	}


	public static void fibonacci(int a, int b){

	System.out.println(b);
		if(a < 1000){
		fibonacci(a+b,a);

	}


}
}