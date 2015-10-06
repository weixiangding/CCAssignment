
public class Solution01 {
	// A function to insert m into n by bits manipulation.
	public static int insertBits(int n, int m, int i, int j){
		int k = ~0;
		int left = k<<(j+1);
		int right = (1<<i)-1;
		// Generate the mask
		int mask = left|right;
		n = n&mask;
		m = m<<i;
		return m|n;
	}
	// Main functin to test
	public static void main(String args[]){
		// n=100000;
		int n=32;
		// m=101;
		int m=5;
		// i=1, j=3;
		System.out.println(insertBits(32, 5, 1, 3));
		// answer should be 101010 and that's 42 in 10's base.
	}
}
