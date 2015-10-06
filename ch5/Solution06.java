
public class Solution06 {
	// A function to find the number of bits that need to flip to covert a to be.
	public static int flipnum(int a, int b){
		// XOR these two numbers
		int temp = a^b;
		int count=0;
		// Count the different bits
		while (temp!=0){
			if ((temp&1)!=0)
				count++;
			temp>>=1;
		}
		return count;
	}
	// Main function to test
	public static void main(String args[]){
		System.out.println(flipnum(29,15));
		System.out.println(flipnum(31,0));
		System.out.println(flipnum(123,11));
	}
}
