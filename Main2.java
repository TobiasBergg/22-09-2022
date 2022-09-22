class Main2{
	
	public static void main(String [] args){

		printPartOfWord("København",1,4);
	}

	public static void printPartOfWord(String str, int i, int l){

		String subStr;
		subStr = str.substring(i,i+l);
		System.out.println(subStr);

	}
}