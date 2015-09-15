
public class Solution19 {
	/* A function to check if a string is a rotation of another one */
	public static boolean isRotate(String s1, String s2){
		/* Obtain the lengths of these two strings */
		int len1=s1.length();
		int len2=s2.length();
		/* Handle edge cases */
		if (len1!=len2) return false;
		if (len1==len2&&len1==0) return true;
		/* Let s1=AB, if s2=BA, then s2 must be a substring of s1+s1=ABAB. */
		String s3=s1+s1;
		/* Call isSubstring function */
		if (s3.contains(s2)) return true;
		else return false;
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test sample */
		String s1="waterbottle";
		String s2="erbottlewat";
		/* Call the function and print the result */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(isRotate(s1,s2));
	}
}
