import java.util.*;


public class Solution02 {
	// A function to sort an array of strings so that all the anagrams are next to each other.
	public static String[] group(String[] s){
		int len = s.length;
		if (len==0) return s;
		for (int i=0; i<len-1; i++){
				int count=1;
			for (int j=i+1; j<len; j++){
				// If they are anagram then make them next to each other.
				if (isAnagram(s[i],s[j])){
					String temp = s[i+count];
					s[i+count]=s[j];
					s[j]=temp;
					count++;
				}
			}
			i=i+count-1;
		}
		return s;
	}
	// A function to check whether two strings are anagram.
	public static boolean isAnagram(String s1, String s2){
		int len1 = s1.length();
		int len2 = s2.length();
		if (len1!=len2) return false;
		char[] c1 = new char[len1];
		char[] c2 = new char[len2];
		c1 = s1.toCharArray();
		c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for (int i=0; i<len1; i++)
			if (c1[i]!=c2[i])
					return false;
		return true;
	}
	// Main function to test
	public static void main(String args[]){
		String[] test = new String[7];
		test[0]="dsa";
		test[1]="qwert";
		test[2]="sad";
		test[3]="dsaqw";
		test[4]="dda";
		test[5]="trewq";
		test[6]="add";
		String[] ans = group(test);
		for (int i=0; i<ans.length; i++)
			System.out.println(ans[i]);
	}
}
