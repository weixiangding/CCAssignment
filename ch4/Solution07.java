import java.util.*;

// It is basically a topological sorting problem
public class Solution07 {
	public static void main(String args[]){
		int num=6;
		boolean[] visited = new boolean[num];
		int[][] matrix = new int[num][num];
		for (int i=0; i<num; i++)
			for (int j=0; j<num; j++){
				matrix[i][j]=0;
			}
		// Use adjacent matrix to express the directed graph
		matrix[0][3]=1;
		matrix[5][1]=1;
		matrix[1][3]=1;
		matrix[5][0]=1;
		matrix[3][2]=1;
		LinkedList<Integer> ans = new LinkedList<Integer>();
		// use BFS
		for (int i=0; i<num; i++){
			boolean flag=true;
			for (int j=0; j<num; j++)
			{
				if (matrix[j][i]!=0)
					{
						flag=false;
						break;
					}
					
			}
			if (flag) {
				ans.add(i);
				visited[i]=true;
			}
		}
		while(ans.size()!=0){
			int temp=ans.poll();
			System.out.println((char)('a'+temp));
			for (int i=0; i<num; i++){
				if (matrix[temp][i]==1&&!visited[i])
					{
						ans.add(i);
						visited[i]=true;
					}
			}
		}
	}
}
