import java.util.Arrays;

public class Solution14 {
	/* A function to check if the string is a permutation of a palindrome */
	/* Assumption: there are only letters and spaces in the input string */
	public static Boolean isPerOfPal(String s){
		/* Obtain the length of the string */
		int len=s.length();
		/* Handle edge cases */
		if (len==0) return true;
		/* Make all letters into lower cases */
		s=s.toLowerCase();
		/* Convert the string to a character array and sort it*/ 
		char[] c= new char[len];
		c=s.toCharArray();
		Arrays.sort(c);
		/* To check if all the letters occur even times except at most one letter occur odd times */
		
		int fnum=0;
		for (int i=0; i<len-1; i++){
			if (fnum>1) return false;
			int sum=1;
			if (c[i]!=' '){
				for (int j=i+1; j<len; j++){
					if (c[i]==c[j]) sum++;
					if (c[i]!=c[j]) break;
				}
				if (sum%2==0) i=i+sum-1;
				else fnum++;
			}
				
		}
		/* If match the condition above then return true */
		if (fnum>1) return false;
		return true;
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test sample */
		String s="Tact CoJJJJka  JJJJk";
		/* Call the function and print the result */
		System.out.println(s);
		System.out.println(isPerOfPal(s));
	}
}
