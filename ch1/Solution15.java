import java.util.Arrays;

public class Solution15 {
	/* A function to check if a string was edited only once before the other string */
	public static Boolean isOneEdit(String s1, String s2){
		/* Obtain the lengths of these two strings */
		int len1=s1.length();
		int len2=s2.length();
		/* Handle edge cases */
		if (len1==0&&len2==0) return true;
		if (len1==0&&len2==1) return true;
		if (len1==1&&len2==0) return true;
		if (Math.abs(len1-len2)>=2) return false;		
		if (s1.compareTo(s2)==0) return true;
		/* If their lengths are the same, compare them one by one */
		/* If an element is different, return false; */
		if (len1==len2){
			int num=0;
			for (int i=0; i<len1; i++){
				if (s1.charAt(i)!=s2.charAt(i))
					num++;		
			}
			if (num>1) return false;
			else return true;
		}
		/* If their lengths are different, find the different character and then compare other two substrings */
		
		else if (len1>len2){
			for (int i=0; i<len2; i++){
				if (s1.charAt(i)!=s2.charAt(i)){
					if (i!=0){
						if (s1.substring(0, i).compareTo(s2.substring(0, i))==0&&s1.substring(i+1, len1).compareTo(s2.substring(i, len2))==0)
						{
							return true;
						}
						else return false;
					}
					if (i==0){
						if (s1.substring(1, len1).compareTo(s2.substring(0, len2))==0)
						{
							return true;
						}
						else return false;
					}
				}
			}
			return true;
		}
		/* If their lengths are different, find the different character and then compare other two substrings */
		else if (len1<len2){
			for (int i=0; i<len1; i++){
				if (s1.charAt(i)!=s2.charAt(i)){
					if (i!=0){
					if (s1.substring(0, i).compareTo(s2.substring(0, i))==0&&s1.substring(i, len1).compareTo(s2.substring(i+1, len2))==0)
					{
						return true;
					}
					else return false;
					}
					if (i==0){
						if (s1.substring(0, len1).compareTo(s2.substring(1, len2))==0){
							return true;
						}
						else return false;
					}
				}
			}
			return true;
		}
		return true;
	}
	/* Main functions */
	public static void main(String args[]){
		/* Test sample */
		String s1="cdd";
		String s2="bd";
		/* Call the function and print the result */
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(isOneEdit(s1,s2));
	}
}
