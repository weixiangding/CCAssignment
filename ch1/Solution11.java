
public class Solution11 {
	/* A function to check if a string has all unique characters */
	public static boolean isUnique(String s){
		/* Obtain the length of the String s */
		int len=s.length();
		/* handle edge cases */
		if (len==0) return true;
		/* to check if all the characters are unique */
		for (int i=0; i<len-1; i++){
			for (int j=i+1; j<len; j++){
				if (s.charAt(i)==s.charAt(j))
					return false;
			}
		}
		return true;
	}
	/* main function to test the answer */
	public static void main(String args[]){
		/* a test sample */
		String s="75910dasc23";
		/* call the isUnique function and print the result */
		System.out.println(isUnique(s));
	}
}
