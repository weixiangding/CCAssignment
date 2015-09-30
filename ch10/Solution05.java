import java.util.*;


public class Solution05 {
	// A function to search a string in the array with many empty strings.
	public static int GetLocation(ArrayList<String> slist, String s){
		int begin=0;
		int end=slist.size()-1;
		// Use binary search.
		while(begin<=end){
			int mid = begin + (end-begin)/2;
			if (slist.get(mid)==s) return mid;
			else if (slist.get(mid).compareTo(s)<0&&!slist.get(mid).isEmpty()) begin=mid+1;	
			else if (slist.get(mid).compareTo(s)>0&&!slist.get(mid).isEmpty()) end=mid-1;
			// Deal with empty strings.
			else if (slist.get(mid).isEmpty()){
			    
				int i=1;
				while(true){
				if ((mid+i<slist.size())&&!slist.get(mid+i).isEmpty())
						{
							
							if (slist.get(mid+i)==s) return mid+i;
							if (slist.get(mid+i).compareTo(s)<0) begin=mid+1;	
							if (slist.get(mid+i).compareTo(s)>0) end=mid-1;
							break;
						}
				if (mid-i>=0&&!slist.get(mid-i).isEmpty())
						{
							if (slist.get(mid-i)==s) return mid-i;
							if (slist.get(mid-i).compareTo(s)<0) begin=mid+1;	
							if (slist.get(mid-i).compareTo(s)>0) end=mid-1;
							break;
						}
						i++;
			}
		}
	}
		return -1;
	}
	
	// Main function to test
	public static void main(String args[]){
		ArrayList<String> test = new ArrayList<String>();
		test.add("at");
		test.add("");
		test.add("");
		test.add("");
		test.add("ball");
		test.add("");
		test.add("");
		test.add("car");
		test.add("");
		test.add("");
		test.add("dad");
		test.add("");
		test.add("");
		String s1="dad";
		System.out.println(GetLocation(test,s1));
		System.out.println(GetLocation(test,"ball"));
	}
}
