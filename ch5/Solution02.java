
public class Solution02 {
	// A function to represent a number by bits
	public static String BinaryRepresent(double num){
		if (num>=1||num<=0)
			return "ERROR";
		String ans = new String();
		ans+=0;
		ans+=".";
		while (num>0){
			// If the length is longer than 32 then return ERROR.
			if (ans.length()>32) {
				return "ERROR";
			}
			// Keep multiplying 2 and choose the most significant bit.
			double temp = num*2;
			if (temp>=1){
				ans+=1;
				num=temp-1;
			}
			else {
				ans+=0;
				num=temp;
			}
		}
		return ans;
	}
	// Main function to test
	public static void main(String args[]){
		System.out.println(BinaryRepresent(0.75));
		System.out.println(BinaryRepresent(1.75));
		System.out.println(BinaryRepresent(0.125));
		System.out.println(BinaryRepresent(0.875));
	}
}
