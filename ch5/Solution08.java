// Assumption: The input array is all 0, which means the screen is white.
// Then we draw the specific line by setting their values to be 1.
public class Solution08 {
	public static void drawLine(byte[] screen, int width, int x1, int x2, int y){
		int len = screen.length;
		// Get the height
		int height=len/width;
		// Handle edge cases
		if (x1>height||x2>height){
			System.out.println("ERROR");
			return;
		}
		// draw the line
		for (int i=x1; i<=x2; i++){
			screen[i*width+y]=1;
		}
		return;
	}
	// Main function to test
	public static void main(String args[]){
		byte[] test = {0,0,0,0,0,0,0,0,0};
		drawLine(test, 3, 1, 2, 1);
		for (int i=0; i<9; i++)
			System.out.println(test[i]);
	}
}
