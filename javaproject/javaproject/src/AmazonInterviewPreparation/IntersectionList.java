package AmazonInterviewPreparation;
import java.util.*;
public class IntersectionList {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	MyNode head=new MyNode(0);
	MyNode temp=head;
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
		temp.next=new MyNode(sc.nextInt());
		temp=temp.next;
	}
	int m=sc.nextInt();
    MyNode list1=head.next;
    MyNode head1=new MyNode(0);
    MyNode t=head1;
    for(int i=0;i<m;i++) {
    	t.next=new MyNode(sc.nextInt());
    	t=t.next;
    }
    MyNode list2=head1.next;
//    while(list1!=null) {
//    	System.out.print(list1.data+" ");
//    	list1=list1.next;
//    }
//    System.out.println();
//    while(list2!=null) {
//    	System.out.print(list2.data+" ");
//    	list2=list2.next;
//    }
	MyNode res=intersectionPoint(list1,list2);
	if(res==null) {
		System.out.println(-1);
	}else {
	System.out.println(res.data);
	}
	}
public static MyNode intersectionPoint(MyNode l1,MyNode l2) {
Set<Integer>set=new LinkedHashSet<>();
MyNode temp1=l1;
MyNode temp2=l2;
while(temp1!=null) {
	set.add(temp1.data);
	temp1=temp1.next;
}
MyNode res=null;
while(temp2!=null) {
	if(set.contains(temp2.data)) {
		res=temp2;
		break;
	}
	set.add(temp2.data);
	temp2=temp2.next;
}
//for(int a:set)System.out.print(a+" ");
return res;
}
}
class MyNode{
	MyNode next;
	int data;
	MyNode(int data){
		this.data=data;
		this.next=null;
	}
}