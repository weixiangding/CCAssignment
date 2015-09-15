import java.util.Arrays;

public class Solution12 {
	/* A function to decide if a string is a permutation of the other one */
	public static boolean isPermutation(String s1, String s2){
		/* Obtain the lengths of these two strings */
		int len1=s1.length();
		int len2=s2.length();
		/* Handle edge cases */
		if (len1!=len2) return false;
		if (len1==0&len2==0) return true;
		/* Change these two strings to two character arrays */
		char[] char1 = new char[len1];
		char[] char2 = new char[len1];
		char1= s1.toCharArray();
		char2= s2.toCharArray();
		/* sort these two arrays */
		Arrays.sort(char1);
		Arrays.sort(char2);
		/* Compare these two arrays from begin to the end */
		for (int i=0; i<len1; i++)
			if (char1[i]!=char2[i]) return false;
		return true;
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test sample */
		String s1="75910 23d";
		String s2="0531792 d";
		/* Call the function and print the result */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(isPermutation(s1,s2));
	}
}
