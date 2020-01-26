
import java.util.LinkedList;
import java.util.Scanner;

class ll
{
    static Node head=null;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            this.data=d;
        }
    }
    public static ll insert(ll l,int d)
    {
        Node newnode=new Node(d);
        Node ptr=null;
        newnode.next=null;
        if(l.head==null)
            l.head=newnode;
        else {
            ptr = l.head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = newnode;
        }
        return l;
    }
    public static void printlist (ll l)
    {
        Node ptr=l.head;
        System.out.println("Resulting list is:");
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    static int count_node(ll l)
    {
        int count =0;
        Node ptr=l.head;
        while(ptr!=null)
        {
            count++;
            ptr=ptr.next;
        }
        return count;
    }
    static void middlemy(ll l,int count1)
    {
        int n=0;
        Node ptr=l.head;
        if(count1%2==0)
        {
            while(n!=count1/2-1)
            {
                n++;
                ptr=ptr.next;
            }
            System.out.println(ptr.data+" "+ptr.next.data);
        }
        else
        {
            while(n!=count1/2)
            {
                n++;
                ptr=ptr.next;
            }
            System.out.println(ptr.data);
        }
    }
    static void middlemam(ll l)
    {
        Node ptr1=l.head;
        Node ptr2=l.head;
        while(ptr2.next!=null && ptr2.next.next!=null)
        {
            ptr1=ptr1.next;
            ptr2=ptr2.next.next;
        }
        if(ptr2.next==null)
        {
            System.out.println("middle element is;"+ ptr1.data);
        }
        else
        {
            System.out.println("middle element is:"+ptr1.data+" "+ptr1.next.data);
        }
    }
    public static ll addbeg(ll l2,int f)
    {
        Node newnode=new Node(f);
        newnode.next=l2.head;
        l2.head=newnode;
        return l2;
    }
    public static ll addKth(int position,int d,ll l2)
    {
        Node n=new Node(d);
        int i=1;
        Node ptr=l2.head;
        while(i<position-1)
        {
            ptr=ptr.next;
            i++;
        }
        n.next=ptr.next;
        ptr.next=n;
        return l2;
    }
    public static ll addLast(ll l2,int d)
    {
        Node n=new Node(d);
        n.next=null;
        Node ptr=l2.head;
        while(ptr.next!=null);
        {
            ptr=ptr.next;

        }
        ptr.next=n;

        return l2;
    }
    public static void movelast(ll l2)
    {
        Node prev=null;
        Node ptr=head;
        while(ptr.next!=null)
        {
            prev=ptr;
            ptr=ptr.next;
        }
        prev.next=null;
        ptr.next=head;
        head=ptr;
        l2.printlist(l2);
    }
    public static void deletefirst(ll l,int pos)
    {
        Node ptr=head;
        while(pos>2)
        {
            ptr=ptr.next;
            pos--;
        }
        ptr.next=ptr.next.next;
        printlist(l);
    }
    public static void deleteKth(ll l,int pos,int total)
    {
        Node ptr=head;
        int a=total-pos+1;
        while(a>2)
        {
            ptr=ptr.next;
            a--;
        }
        ptr.next=ptr.next.next;
        printlist(l);

    }
    public static void reverse(ll l)
    {
        Node c=l.head;
        Node prev=null;
        Node n=null;
        while(c!=null)
        {
            n=c.next;
            c.next=prev;
            prev=c;
            c=n;
        }
        head=prev;
        printlist(l);


    }
    public static int midele(ll l,int count)
    {
        Node ptr=l.head;
        int n=count/2;
        while(n!=0)
        {
            ptr=ptr.next;
            n--;
        }
        return ptr.data;

    }
    public static void pallindrome(ll l)
    {
        ll z=new ll();
        int count=0;
        Node ptr=l.head;
        while(ptr!=null)
        {
            z=ptr.insert(ptr.data);
            ptr=ptr.next;
            count++;
        }
        z.reverse();
        printlist(z);
    }
}
public class Linkedlist
{
    public static void main(String [] args)
    {
        ll l1=new ll();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a;
        int res;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            a=sc.nextInt();
            l1=ll.insert(l1,a);
            count++;
        }
        l1.addbeg(l1,10);
        //l1.printlist(l1);
        //l1.addKth(3,17,l1);
        l1.printlist(l1);

//        l1=l1.addLast(l1,19);
//        l1.printlist(l1);
        //   l1.movelast(l1);
        //ll.deletefirst(l1,3);
        //ll.deleteKth(l1,3,count);
        //l1.reverse(l1);
        res=l1.midele(l1,count);
    }
}
