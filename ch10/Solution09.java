
public class Solution09 {
	static int x=-1;
	static int y=-1;
	// A function to search an element in a matrix.
	public static boolean searchMatrix(int[][] matrix, int target){
		int lenx = matrix.length;
		if (lenx == 0) return false;
		int right = matrix[0].length-1;
		int left = 0;
		// Binary Search from the up right corner. It can also work from bottom left corner.
		while (left<lenx&&right>=0){
			if (matrix[left][right]==target){
				x=left;
				y=right;
				return true;
			}
			else if (matrix[left][right]>target)
				right--;
			else if (matrix[left][right]<target)
				left++;
		}
		return false;
	}
	// Main function to test
	public static void main(String args[]){
		int[][] test = new int[3][4];
		test[0][1]=3;
		test[0][2]=5;
		test[0][3]=7;
		test[0][0]=1;
		test[1][0]=10;
		test[1][1]=11;
		test[1][2]=16;
		test[1][3]=20;
		test[2][0]=23;
		test[2][1]=30;
		test[2][2]=34;
		test[2][3]=50;
		if (searchMatrix(test, 16))
			{
				System.out.print(x);
				System.out.print(',');
				System.out.print(y);
				System.out.println();
			}
		else System.out.println("Not found");
	}
}
