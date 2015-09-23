
public class Solution01 {
	// For easy understanding, I set the size of array to be 99;
	// So each stack get 33;
	int[] store = new int[99];
	int s1=0;
	int s2=33;
	int s3=66;
	int num1=0;
	int num2=0;
	int num3=0;
	
	// Push function 
	public void push(int stack_index, int num){

		if (stack_index==1){
			while(s1<=32){
				if (store[s1]==0)
					{
						num1++;
						store[s1]=num;
						break;
					}
				s1++;
			}
		}

		if (stack_index==2){
			while(s2<=64){
				if (store[s2]==0)
					{
						num2++;	
						store[s2]=num;
						break;
					}
				s2++;
			}
		}

		if (stack_index==3){
			while(s3<=98){
				if (store[s3]==0)
					{
						num3++;
						store[s3]=num;
						break;
					}
				s3++;
			}
		}
		return ;
	}
	// Pop function
	public void pop(int stack_index){
		if (stack_index==1){
			for(int i=num1; i>=0; i-- )
				if (store[i]!=0){
					store[i]=0;
					break;
				}
		}

		else if (stack_index==2){
			for(int i=33+num2; i>=33; i-- )
				if (store[i]!=0){
					store[i]=0;
					break;
				}
		}

		else if (stack_index==3){
			for(int i=66+num3; i>=66; i-- )
				if (store[i]!=0){
					store[i]=0;
					break;
				}
		}
		else {
			System.out.println("Invaild stack index321");
			return;
		}
		return ;
	}
	// Peek function
	public int peek(int stack_index){
		if (stack_index==1){
			for(int i=num1; i>=0; i-- )
				if (store[i]!=0){
					return store[i];
				}
		}

		else if (stack_index==2){
			for(int i=33+num2; i>=33; i-- )
				if (store[i]!=0){
					return store[i];
				}
		}

		else if (stack_index==3){
			for(int i=66+num3; i>=66; i-- )
				if (store[i]!=0){
					return store[i];
				}
		}
		else {
			System.out.println("Invaild stack index");

		}
		return 0;
	}
	// isEmpty() function
	public boolean isEmpty(int stack_index){
		if (stack_index==1){
			if (store[0]==0)
				return true;
			else return false;
		}
		else if (stack_index==2){
			if (store[33]==0)
				return true;
			else return false;
		}
		else if (stack_index==3){
			if (store[66]==0)
				return true;
			else return false;
		}
		else {
			System.out.println("Invaild stack index");
			return true;
		}
	}
	
	// main function to test
	public static void main(String args[]){
		Solution01 a = new Solution01();
		a.push(1,1);
		a.push(1,2);
		a.push(1,3);
		a.push(2,6);
		a.push(2,7);
		a.push(2,8);
		a.push(3,11);
		a.push(3,12);
		a.push(3,13);
		System.out.println(a.peek(1));
		System.out.println(a.isEmpty(1));
		System.out.println(a.peek(2));
		System.out.println(a.isEmpty(2));
		System.out.println(a.peek(3));
		System.out.println(a.isEmpty(3));
		a.pop(1);
		a.pop(1);
		a.pop(1);
		a.pop(2);
		a.pop(3);
		System.out.println(a.peek(1));
		System.out.println(a.isEmpty(1));
		System.out.println(a.peek(2));
		System.out.println(a.isEmpty(2));
		System.out.println(a.peek(3));
		System.out.println(a.isEmpty(3));
		
		
	}
}
