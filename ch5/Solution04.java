// I am very confused with the problem description, because the next largest number is not the same 
// as the next number but not very large, which is described in the solution.
// Therefore, my first solution is totally wrong and I fix it by referring the textbook.
// The original problem is the same as the next permutation problem.
public class Solution04 {
	public static int Nextlargest(int n){
		int temp = n;
		int zero=0;
		int one=0;
		// Count the number of zeros
		while (((temp&1)==0)&&(temp!=0)){
			zero++;
			temp=temp>>1;
		}
		// Count the number of ones
		while ((temp&1)==1){
			one++;
			temp=temp>>1;
		}
		int sum=zero+one;
		// Handle edge cases
		if (sum==31) return 0;
		if (sum==0) return 0;
		n=n|(1<<sum);
		n=n&~((1<<sum)-1);
		n=n|(1<<(one-1))-1;
		return n;	
	}
	// Similar process
	public static int Nextsmallest(int n){
		int temp = n;
		int zero=0;
		int one=0;
		// Count the number of ones
		while ((temp&1)==1){
			one++;
			temp=temp>>1;
		}
		// Count the number of zeros
		while (((temp&1)==0)&&(temp!=0)){
			zero++;
			temp=temp>>1;
		}
		
		int sum=zero+one;
		int k=~0;
		n=n&(k<<(sum+1));
		temp = (1<<(one+1))-1;
		n=n|(temp<<(zero-1));
		return n;	
	}
	
	public static void main(String args[]){
		System.out.println(Nextsmallest(12));
		System.out.println(Nextlargest(12));
	}
	
}
