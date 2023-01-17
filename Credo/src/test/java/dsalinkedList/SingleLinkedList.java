package dsalinkedList;

public class SingleLinkedList {
	
	public Node head;
	public Node tail;
	
	public int size; 
	
	public Node createSingleLinkedList(int nodevalue)
	{
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodevalue;
		head = node;
		tail = node;
		size = 12;
		return head;
		
	}

}
