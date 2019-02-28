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

            public Node(int data) {
                this.data = data;
                prev = null;
                next= null;
            }

        }
        private  int size = 0;
        private Node head = null;
        private Node tail = null;


        @Override
        public String toString()
        {
            StringBuilder response = new StringBuilder();
            Node temp = this.head;
            while(temp.next!= null)
            {
                response.append(temp.data);
                if(temp.next !=null) {
                    response.append(" ==>");
                }
                temp = temp.next;
            }
            response.append("]");
            return response.toString();
        }

        private void insertHead(int data)
        {
            Node newNode = new Node(data,null,this.head);
            this.head = newNode;
            size++;

        }

        public static void main(String[] args)
        {
            
        }
    }
