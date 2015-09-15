
public class Solution18 {
	/* A function to set zeros of a matrix */
	public static int[][] SetZero(int[][] matrix, int m, int n){		
		/* record the x coordinate value of zeros */
		int[] x = new int[m*n];
		/* record the y coordinate value of zeros */
		int[] y = new int[m*n];
		int k=0;
		/* To find the locations of all zeros and record them */
		for (int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				if (matrix[i][j]==0)
				{
					x[k]=i;
					y[k]=j;
					k++;
				}
			}
		}
		/* To set the zeros from columns to rows */
		for (int i=0; i<k; i++){
			for (int j=0; j<m; j++){
				matrix[x[i]][j]=0;
			}
			for (int j=0; j<n; j++){
				matrix[j][y[i]]=0;
			}
		}
		return matrix;
			
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test Sample */
		int[][] test = new int[10][10];
		for (int i=0; i<10; i++){
			for (int j=0; j<10; j++)
				test[i][j]=1;
		}
		test[3][4]=0;
		test[1][7]=0;
		test[0][0]=0;
		int[][] test1 = new int[10][10];
		/* Call the function */
		test1=SetZero(test, 10, 10);
		/* Print the result */
		for (int i=0; i<10; i++)
			for (int j=0; j<10; j++)
				{
				System.out.print(test1[i][j]);
				if (j==9) System.out.println();
				}
	
	}
}
