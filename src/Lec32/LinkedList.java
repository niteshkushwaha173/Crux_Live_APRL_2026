package Lec32;

public class LinkedList {
  private  class Node
    {
        int val;
        Node next;
        public Node(int val)
        {
            this.val=val;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    
    //AddFirst
    private void addfirst(int item)
    {
        Node nn=new Node(item);
        if(size==0)
        {
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }

    //AddLast
    private void addlast(int item)
    {
        Node nn=new Node(item);
        if(size==0)
        {
            addfirst(item);
        }
        else{
            Node tail=new Node(item);
            tail.next=head;
            head=nn;
            size++;
        }
    }
    //Add at Index 
    public void addatindex(int item,int k)
    {
        if(k==0)
            {
                addfirst(item);
            }
            else{
                addlast(item);
            }
            else
                {
                    Node prev=getNode(k-1);
                    Node nn=new Node(k);


                }
    }
    public int removelast()
    {
        if(size==1)
            {
                return removefirst();
            }else{
        Node node=getNode(size-2);
        tail=node;
        tail.next=null;
        size--;
        return node.val;
            }
    }

    public int removeatindex(int k)
    {
if(k==0)
    {
        return removefirst();
    }else if(k==size-1)
        {
return removelast();
        }
        else
            
            {
                Node node=
            }
    }
    //Get Node from K place 
    private Node getNode(int k)
    {
        Node temp=head;
        for(int i=0;i<k;i++)
            {
                temp=temp.next;
            }
            return temp;
    }
    public void Display()
    {
        Node temp=head;//Always store in temp variable bcoz head is never move 
        while(temp==null)
            {
                System.out.println(temp.val+"->");
                temp=temp.next;
            }
    }
}
