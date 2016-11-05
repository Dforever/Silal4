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

public static void ReverseStack(Stack st1, Stack st2) {
	String data = "";
	while ((data = st1.pop()) !=null) {
		st2.push(data);
	}
}

public static void EvalStackQueue() {
	Stack st2 = new Stack();
	MyQueue qu2 = new MyQueue();
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


			String data = "";
			while ((data = st.pop()) != null) {
				qu2.enqueue(data);
			}

			DeQ(qu2);
		}

public static void EvalQueueStack() {
			Stack st1 = new Stack();
			Stack st2 = new Stack();
			MyQueue qu2 = new MyQueue();
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

				String data = "";
				while ((data = qu.dequeue()) != null) {
					st1.push(data);
				}
				ReverseStack(st1, st2);
				StPop(st2);
			}

			public static void EvalStackStack() {
							Stack st2 = new Stack();
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
							ReverseStack(st, st2);
							ReverseStack(st2, st);
							st.print();



					}
}