//This is derived from the link(https://github.com/csi-cen-213) on the CSI-213CLASS github
public class ListNode {
	//local variables
	private ListNode head;
	private String info;
	private ListNode tail;

	//This constructor contains just solely data
	public ListNode(String Info) {
		head = null;
		info = Info;
		tail = null;

	}

	//get head
	public ListNode getHead() {
		return head;
	}

	//set the head node
	public void setHead(ListNode NewHead) {
		head = NewHead;
	}
	//get tail
	public ListNode getTail() {
		return tail;
	}
	//set the tail
	public void setTail(ListNode NewTail) {
		tail = NewTail;
	}
	//get info
		public String getInfo() {
			return info;
	}
	//set the info of the node
	public void setInfo(String Info) {
		Info = info;
	}

}