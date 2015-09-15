
public class Solution17 {
	/* A function to rotate the matrix by 90 degrees using O(1) space*/
	/* Assumption: make the rotation in the clockwise direction and the matrix is a not null matrix*/
	/* The algorithm of counterclockwise is similar */
	public static int[][] Rotate(int[][] matrix, int n){
		/* Each time deal with the outermost layer */ 
			for (int loop=0; loop<n/2; loop++){
				int begin=loop;
				int end=n-1-loop;
				/* For each layer swith four points in the order*/
				for (int i=loop; i<end; i++){
					int temp=matrix[begin][i];
					matrix[begin][i]=matrix[end-i+loop][begin];
					matrix[end-i+loop][begin]=matrix[end][end-i+loop];
					matrix[end][end-i+loop]=matrix[begin+i-loop][end];
					matrix[begin+i-loop][end]=temp;
				}
			}
			return matrix;
		}
	/* Main function to test */
	public static void main(String args[]){
		/* Test Sample */
		int[][] matrix = new int[5][5];
		for (int i=0; i<5; i++)
			for (int j=0; j<5; j++)
				{
					matrix[i][j]=i+j;
					System.out.print(matrix[i][j]);
					if (j==4) System.out.println();
				}
		System.out.println();
		/* Call the function */
		matrix=Rotate(matrix, 5);
		/* Print the result */
		for (int i=0; i<5; i++)
			for (int j=0; j<5; j++)
				{
					System.out.print(matrix[i][j]);
					if (j==4) System.out.println();
				}
	}
}
