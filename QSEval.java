public class QSEval {
	public static void main(String args[]) {
		System.out.println("EvalStack()");
		EvalStack();
		System.out.println("EvalQueue()");
		EvalQueue();
		System.out.println("EvalStackQueue()");
		EvalStackQueue();
		System.out.println("EvalQueueStack()");
		EvalQueueStack();
		System.out.println("EvalStackStack()");
		EvalStackStack();
	}

	public static void EvalStack() {
		Stack st = new Stack();
		st.push("mouse");
		st.push("keyboard");
		st.push("tower");
		st.push("moniter");
		st.push("printer");
		st.push("flash drive");
		st.push("mic");
		st.push("earbud");
		st.print();
		StPop(st);

	}

	public static void StPop(Stack st) {
		while (st.peek() !=null) {
			System.out.print(st.pop());
		if (st.peek() != null) {
			System.out.print(" = ");
		}
	}
	System.out.println("");
}

public static void EvalQueue() {
	MyQueue qu = new MyQueue();
	qu.enqueue("mouse");
	qu.enqueue("keyboard");
	qu.enqueue("tower");
	qu.enqueue("moniter");
	qu.enqueue("printer");
	qu.enqueue("flash drive");
	qu.enqueue("mic");
	qu.enqueue("earbud");
	qu.print();
	DeQ(qu);
}

public static void DeQ(MyQueue qu) {
	while (qu.peek() != null) {
		System.out.print(qu.dequeue());
		if (qu.peek() != null) {
			System.out.print(" = ");
		}
	}
	System.out.println("");
}