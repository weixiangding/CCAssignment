
public class Solution16 {
	/* A function to do String compression */
	public static String StringCompress(String s){
		/* Obtain the length */
		int len=s.length();
		String ans = new String();
		/* Handle edge cases */
		if (len==0) return ans;
		
		for (int i=0; i<len; i++){
			/* To deal with each character, if it is the same as the next index, then keep moving until different */
			ans=ans+s.charAt(i);
			int num=1;
			if (i==len-1){
				ans=ans+Integer.toString(num);
				break;
			}
			/* Calculate the number of occuring times of each distinct character */
			for (int j=i+1; j<len; j++){
				if (s.charAt(i)!=s.charAt(j))
					{
						ans=ans+Integer.toString(num);
						i=i+num-1;
						break;
					}
				else num++;
				if (j==len-1){
					ans=ans+Integer.toString(num);
					i=i+num-1;
					break;
				}
			}
		}
		/* if the length after compression is longer than original string, return original one */
		int anslen=ans.length();
		if (anslen<len) return ans;
		else return s;
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test Sample */
		String s="acccccccvbbbgggghjjjjjyiklfff";
		/* Call the function and print the result */
		System.out.println(s);
		System.out.println(StringCompress(s));
	}
}
