
public class Solution03 {
	// A function to find the longest sequence after only revising one bit
	public static int LongestSeq(int n){
		int max=0;
		// To deal with each bit
		for (int i=0; i<32; i++){
			int count=0;
			for (int j=0; j<32; j++){
				if (j==i||((n&(1<<j))!=0))
				{
					count++;
					// Get the max count
					max = Math.max(max, count);
				}
				else count=0;
			}
		}
		return max;
	}
	// Main function to test
	public static void main(String args[]){
		System.out.println(1775);
		System.out.println(LongestSeq(1775));
	}
}
