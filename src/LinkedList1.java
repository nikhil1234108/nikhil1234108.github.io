// Node class representing a single node in a linked list

class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class  LinkedList1 {
    Node head;

    // Method to insert a node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) { // If list is empty, new node becomes head
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) { // Traverse to last node
            current = current.next;
        }
        current.next = newNode; // Insert at the end
    }

    // Method to traverse and print the linked list
    public static void traverseLinkedList(Node head) {
        Node current = head;

        while (current != null) { // Traverse until the last node
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList1 obj = new LinkedList1();
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);

        // Print the linked list
        traverseLinkedList(obj.head);
    }
}
