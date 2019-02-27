package main;

public class SinglyLinkedList
{
    private Node head=null;
    private int size=0;

    //method to insert a new node at the head
    private void insertHead(int value) {
        this.head = new Node(value,this.head);
        size++;
    }

    //method to insert a new node after a node
    private void insertAfter(int value,Node node)
    {
        node.next = new Node(value,node.next);
        size++;
    }

    //common method for insert
    public void insert(int data)
    {
        if(head==null) {
            insertHead(data);

        }
        else {
            Node temp = this.head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            insertAfter(data,temp);
        }

    }

    private int removeHead() {
        int response = -1;
        Node temp = this.head;
        if (head != null) {
            this.head = this.head.next;

        }

        if (temp != null) {
            size--;
            response = temp.data;

        }
        return response;
    }





    public String toString()
    {
        StringBuilder result = new StringBuilder();

        Node temp = head;
        System.out.print("[");
        while(temp!=null)
        {
            result.append(temp.data);
            if(temp.next!=null)
            {
                result.append("==>");
            }
            temp  = temp.next;

        }
        return result.append("]").toString();

    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args)
    {
     SinglyLinkedList linkedList = new SinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.insert(i + 1);
        }
        Node temp = linkedList.head;
        while(temp!=null){
            if(temp.data ==5)
            {
                linkedList.insert(42);
            }
                temp = temp.next;
                }
     System.out.println(linkedList);


    }
}
