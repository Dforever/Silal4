//This is derived from the link(https://github.com/csi-cen-213) on the CSI-213CLASS github
public class ListNode {
	//local variables

	private String info;
	private ListNode tail;

	//This constructor contains just solely data
	public ListNode(String Info) {

		info = Info;
		tail = null;

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