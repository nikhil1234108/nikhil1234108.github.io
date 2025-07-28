class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2<T> {
    private Node<T> head;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int index, T data) {
        if (index == 0) {
            Node<T> newNode = new Node<>(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node<T> current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> newNode = new Node<>(data);
        newNode.next = current.next;
        current.next = newNode;
    }
    public void delete(T data){
        if (head == null) return;
        if(head.data == data){
            head = head.next;
        }
        Node<T> current = head;
        while (current.next!=null && current.next.data != data){
            current = current.next;
        }
        if(current.next == null){
            current.next = current.next.next;
        }
    }
    public boolean search(T data){
        Node<T> current = head;
        while(current!=null){
            if(current.data.equals(data)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }
    public static void main(String[] args) {
        LinkedList2<Character> charList = new LinkedList2<>();

        charList.insert('A');
        charList.insert('B');
        charList.insert('C');
        charList.insertAt(1, 'X');  // Insert 'X' at index 1
        charList.insertAt(3, 'Y');  // Insert 'Y' at index 3
        charList.delete('Y');
        System.out.println("Character Linked List: " + charList);
    }

    public static void main1(String[] args) {
        LinkedList2<Character> charList = new LinkedList2<>();

        charList.insert('A');
        charList.insert('B');
        charList.insert('C');
        charList.insertAt(1, 'X');  // Insert 'X' at index 1
        charList.insertAt(3, 'Y');  // Insert 'Y' at index 3

        System.out.println("Character Linked List: " + charList);


    }

}



