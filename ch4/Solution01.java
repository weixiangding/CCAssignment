
public class Solution01 {
	// Use 7 points for test.
	static int n=7;
	static boolean[] visited= new boolean[n];
	static int[][] matrix = new int[n][n];
	// A function to test whether there is a root between begin and end
	// DFS
	public static boolean HaveRoute(int begin, int end){
		visited[begin]=true;
		if (matrix[begin][end]==1)
			return true;
		for (int i=0; i<n; i++){
			int k=begin;
			if (!visited[i]&&matrix[begin][i]==1)
				{
				visited[i]=true;	
				begin=i;
					if (HaveRoute(begin,end)) { System.out.println(begin); return true;}
				}
			begin=k;
			visited[i]=false;
		}
		return false;
	}
	// Main function to test
	public static void main(String args[]){
		for (int i=0; i<n; i++)
			for (int j=0; j<n; j++)
				matrix[i][j]=0;
		matrix[0][1]=1;
		matrix[1][3]=1;
		matrix[2][5]=1;
		matrix[3][2]=1;
		matrix[4][6]=1;
		matrix[5][4]=1;
		matrix[3][4]=1;
		matrix[1][2]=1;
		matrix[5][2]=1;
		matrix[0][5]=1;
		matrix[2][6]=1;
		System.out.println(HaveRoute(1,3));
		System.out.println(HaveRoute(2,3));
		System.out.println(HaveRoute(4,3));
		System.out.println(HaveRoute(6,3));
		
		
	}
}


