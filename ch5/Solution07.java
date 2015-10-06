	
public class Solution07 {
	// I use the same method in the textbook but I did not notice arithmetic shift right is more accurate.
	public static int swapbit(int x){
		// Use the mask 101010101010...10 to find the bits in even indexes.
		int temp1= (x&0xAAAAAAAA)>>1;
		// Use the mask 010101010101...01 to find the bits in odd indexes.
		int temp2= (x&0x55555555)<<1;
		// Return the answer
		return temp1|temp2;
	}
	// Main function to test
	public static void main(String args[]){
		System.out.println(swapbit(10));
	}
}
