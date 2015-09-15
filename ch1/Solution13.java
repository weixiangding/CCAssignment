import java.util.Arrays;

public class Solution13 {
	/* A function to replace all spaces in a string with "%20" */
	/* Assumption: input is a char array instead of a string as the question describes */
	public static char[] Replace(char[] c, int len){
		/* Handle edge cases */
		if (len==0) return c;
		/* Traverse the char array and find each space, then repalce them with "&20" */
		for (int i=0; i<len; i++){
			if (c[i]==' '){
				for (int j=len-1; j>=i+1; j--)
					c[j+2]=c[j];
				c[i]='%';
				c[i+1]='2';
				c[i+2]='0';
				len=len+2;
			}
		}
		return c;
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test Sample */
		char[] c={'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', ' ', ' ', ' ', ' '};
		/* Call the function and print the result */
		for (int i=0; i<12; i++)
		System.out.print(Replace(c, 7)[i]);
	}
}
