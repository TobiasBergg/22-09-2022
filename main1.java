class main1{

	public static void main(String [] args){

		printIfPalindrome("Den laks skal ned");
	
	}
	public static void printIfPalindrome(String str){

			str = str.toLowerCase();
			int strLength = str.length();
			String rev = "";
			for(int i = (strLength-1);i>=0;i--){
			rev += str.charAt(i);
			
			
			}
			if(rev.equals(str)){
			System.out.println("It is a Palindrome!!!");
			}
				else{
					System.out.println("It is NOT a palindrome!");
			}
		}
}
