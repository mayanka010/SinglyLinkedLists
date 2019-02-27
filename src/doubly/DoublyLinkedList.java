package doubly;

public class DoublyLinkedList
    {
        private static class Node{
            private  int data;
            private Node prev = null , next= null;

            public Node(int data, Node prev, Node next) {
                this.data = data;
                this.prev = prev;
                this.next = next;
            }


        }
    }
