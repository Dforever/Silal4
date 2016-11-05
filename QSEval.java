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

