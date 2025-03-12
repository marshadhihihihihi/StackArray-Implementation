import java.util.Scanner;
class StackArray {
	
	private int capacity ;
	private int topElement;
	private int[] stack ;
	
	public StackArray(int size) {
		
		this.capacity = size;
		this.topElement = -1;
		this.stack = new int[size];
		
	}
	
	public void push(int number) {
		
		if (topElement == capacity - 1) {
			
			System.out.println ("This stack is full");
			
		}
		topElement++;
		stack[topElement] = number;
		System.out.println ("Pushed : "+number);
	}
	
	public void pop () {
		
		if (topElement == -1) {
			
			System.out.println ("Stack is empty");
			
		}
		
		System.out.println();
		System.out.println ("Popped : "+stack[topElement]);
		topElement--;
		
	}
	
	public void peek() {
		
		if (topElement == -1) {
			
			System.out.println ("Stack is empty");
			
		}
		
		System.out.println();
		System.out.println("Peeked : "+stack[topElement]);
	}
	
	public boolean isEmpty() {
		
		return topElement == -1;
		
	}
	
	public boolean isFull() {
			
			return topElement == capacity - 1;
			
	}
	
	public void display() {
		
		if (topElement == -1) {
			
			System.out.println("This stack is empty");
			
		}
		System.out.println("Elements in this stack : ");
		for (int i = 0; i  <= topElement; i++) {
				
			System.out.print(stack[i]+" ");
			
		}
	}
	
	public int size() {
		
		return capacity;
		
	}
	
	public static void main (String...args) {
		
		StackArray stack = new StackArray(5);
		Scanner sc = new Scanner(System.in);
	
		for (int i = 0; i < stack.size(); i++) {
			
			System.out.print("Enter number "+(i + 1)+" : ");
			int num = sc.nextInt();
			stack.push(num);
			
		}
		System.out.println();
		stack.display();
		System.out.println();
		
		stack.pop();
		
		stack.display();
		System.out.println();
		
		stack.peek();
		
		System.out.println ("This stack is empty : "+stack.isEmpty());
		System.out.println ("This stack is full : "+stack.isFull());
	}
}