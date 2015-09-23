import java.util.LinkedList;


public class Solution06 {
	// 0 is dog, 1 is cat;
	static LinkedList<Integer> animal = new LinkedList<Integer>();
	// Build the queue, regardless of cat or dog.
	public static void enqueue(int type){
		if (type==0)
			animal.add(0);
		if (type==1)
			animal.add(1);
		return;
	}
	
	//Dequeue regardless of cat or dog.
	public static void dequeueAny(){
		animal.poll();
		return;
	}

	//Only dequeue the dog and adjust the original queue
	public static LinkedList dequeueDog(){
		LinkedList<Integer> save = new LinkedList<Integer>();
		int size=animal.size();
		if (size==0)
			return animal;

		if (size!=0){
			int temp=animal.poll();
			if (temp==0)
				return animal;
			else if (temp==1)
			{
				while (temp!=0){
					save.add(temp);
					temp=animal.poll();
				}
				while (animal.size()!=0){
					int temp2=animal.poll();
					save.add(temp2);
				}
				animal=save;
				return animal;
			}
		}
		return animal;
	}
	
	//Only dequeue the cat and adjust the original queue
	public static LinkedList dequeueCat(){
		LinkedList<Integer> save = new LinkedList<Integer>();
		int size=animal.size();
		if (size==0)
			return animal;

		if (size!=0){
			int temp=animal.poll();
			if (temp==1)
				return animal;
			else if (temp==0)
			{
				while (temp!=1){
					save.add(temp);
					temp=animal.poll();
				}
				while (animal.size()!=0){
					int temp2=animal.poll();
					save.add(temp2);
				}
				animal=save;
				return animal;
			}
		}
		return animal;
	}
	
	// Main function to test
	public static void main(String args[]){
		enqueue(1);
		enqueue(0);
		enqueue(1);
		enqueue(0);
		enqueue(0);
		enqueue(1);
		enqueue(1);
		dequeueAny();
		System.out.println(animal.peek());
		dequeueAny();
		System.out.println(animal.peek());
		LinkedList<Integer> answer = dequeueDog();
		System.out.println(answer.peek());
		answer = dequeueCat();
		System.out.println(answer.peek());
	}
}
