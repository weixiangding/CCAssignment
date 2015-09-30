
public class Solution01 {
	// A function to merge and sort array a and array b.
	public static int[] merge(int[] a, int[] b, int num){
		int lenb = b.length;
		for (int i=0; i<lenb; i++){
			if (b[i]<a[0]){
				// find the right place to insert each element of array b
				for (int j=num-1; j>=0; j--)
				{
					a[j+1]=a[j];
				}
				a[0]=b[i];
				num++;
			}
			else if (b[i]>a[num-1]){
				a[num]=a[num-1];
				a[num-1]=b[i];
				num++;
			}
			else {
				// Shift other elements.
				for (int j=1; j<num; j++){
				if (b[i]<=a[j]&&b[i]>=a[j-1]){
					for (int k=num-1; k>=j; k--)
						a[k+1]=a[k];
					a[j]=b[i];
					num++;
					break;
				}
				}
			}
		}
		return a;
	}
	// Main function to test
	public static void main(String args[]){
		int[] test1 = new int [11];
		int[] test2 = new int [5];
		for (int i=0; i<=4; i++)
			test1[i]=i*2;
		for (int i=0; i<5; i++)
			test2[i]=i+1;
		for (int i=0; i<=4; i++)
		{
			System.out.print(test1[i]);
			System.out.print(' ');
		}
		System.out.println();
		for (int i=0; i<5; i++)
		{
			System.out.print(test2[i]);
			System.out.print(' ');
		}
		int[] ans = merge(test1,test2,5);

		System.out.println();
		for (int i=0; i<10; i++)
			{
				System.out.print(ans[i]);
				System.out.print(' ');
			}
	}
}
