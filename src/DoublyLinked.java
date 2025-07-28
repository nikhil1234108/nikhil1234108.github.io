// Node class for Doubly Linked List
package doublylinkedlist;  // Change this based on your project structure
import doublylinkedlist.Node;

class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    // Constructor
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    // Getters
    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    // Setters
    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}

// Doubly Linked List Class
class DoublyLinked<T> {
    private Node<T> head;
    private Node<T> tail;

    // Getter for head
    public Node<T> getHead() {
        return head;
    }

    // Getter for tail
    public Node<T> getTail() {
        return tail;
    }

    // Insert at the end
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    // Insert at a specific index
    public void insertAt(int index, T data) {
        if (index == 0) {
            Node<T> newNode = new Node<>(data);
            newNode.setNext(head);
            if (head != null) {
                head.setPrev(newNode);
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        Node<T> current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.getNext();
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> newnode = new Node<>(data);
        newnode.setNext(current.getNext());
        newnode.setPrev(current);
        if (current.getNext() != null) {
            current.getNext().setPrev(newnode);
        }
        current.setNext(newnode);

        if (newnode.getNext() == null) {
            tail = newnode;
        }
    }

    // Delete a node by value
    public void delete(T data) {
        if (head == null) return;

        if (head.getData().equals(data)) {
            head = head.getNext();
            if (head != null) {
                head.setPrev(null);
            } else {
                tail = null; // List is empty now
            }
            return;
        }

        Node<T> current = head;
        while (current != null && !current.getData().equals(data)) {
            current = current.getNext();
        }
        if (current == null) return;

        if (current.getNext() != null) {
            current.getNext().setPrev(current.getPrev());
        } else {
            tail = current.getPrev(); // Deleting the last node
        }

        if (current.getPrev() != null) {
            current.getPrev().setNext(current.getNext());
        }
    }

    // Search for a value
    public boolean search(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    // Print the list from head to tail
    public void printForward() {
        Node<T> current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.getData() + " <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    // Print the list from tail to head
    public void printBackward() {
        Node<T> current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.getData() + " <-> ");
            current = current.getPrev();
        }
        System.out.println("null");
    }

    // Main Class
    public static void main(String[] args) {
        DoublyLinked<Integer> list = new DoublyLinked<>();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAt(1, 25);
        list.insertAt(2, 45);
        list.delete(20);

        System.out.println("Contains 45? " + list.search(45));

        list.printForward();
        list.printBackward();
    }
}

