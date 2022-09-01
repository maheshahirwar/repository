package DSApractice;

public class LinkedList {

	public static void main(String[] args) {
		MyLinkedList mylist=new MyLinkedList();
      mylist.addToTail("11");
      mylist.addToTail("13");
      mylist.addToTail("18");
      mylist.addToTail("34");
      mylist.addToTail("46");
      mylist.operate();
      mylist.print();
}
}
class Node{
	private String data;
	private Node next;
	public Node(String data) {
		this.data=data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
class MyLinkedList{
	private Node head,tail;

	public Node getHead() {
		return this.head;
	}
	public Node getTail() {
		return this.tail;
	}
	// Add element at the tail of the linkedlist
	public void addToTail(String data) {
		Node node=new Node(data);
		if(this.head==null) {
			this.head=this.tail=node;
		}else {
			this.tail.setNext(node);
			this.tail=node;
		}
	}
	// Add element head of the linkedlist
	public void addToHead(String data) {
		Node node = new Node(data);
		if(this.head==null) {
			this.head=this.tail=node;
		}else {
			node.setNext(this.head);
			this.head=node;
		}
	}
	// print linkedlist
	public void print() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.println(temp.getData());
			temp=temp.getNext();
		}
	}
	public Node find(String data) {
		Node temp=this.head;
		while(temp!=null) {
			if(temp.getData().equals(data))
				return temp;
			temp=temp.getNext();
		}
		return null;
	}
	public void insert(String data, String dataBefore) {
		Node node = new Node(data);
		if(this.head==null) {
			this.head=this.tail=node;
		}else {
			Node nodeBefore=this.find(dataBefore);
			if(nodeBefore!=null) {
			node.setNext(nodeBefore.getNext());
			nodeBefore.setNext(node);
			if(nodeBefore==this.tail) {
				this.tail=node;
			}
		}else {
			System.out.println("Node not found");
		}
	}
}
	public void delete(String data) {
		
		if(this.head==null) {
			System.out.println("Empty LinkedList can not delete element");
		}else {
			Node node = this.find(data);
			if(node ==null) 
				System.out.println("Node not found");
		  else if(this.head==node) {
			this.head=this.head.getNext();
			node.setData(null);
			if(node ==this.tail) {
				tail=null;
			}
		}else {
			Node nodeBefore=null;
			Node temp=this.head;
		while(temp!=null) {
			if(temp.getNext()==node) {
				nodeBefore=temp;
				break;
			}
			temp=temp.getNext();
		}
		nodeBefore.setNext(node.getNext());
		if(this.tail==node)
			this.tail=nodeBefore;
			node.setData(null);
		}
		}
	}
  void operate() {
		Node temp=getHead();
		while(temp.getNext().getNext()!=null) {
			temp.setData(temp.getNext().getData());
			temp=temp.getNext();
		}
	}
}
