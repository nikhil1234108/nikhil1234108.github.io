package doublylinkedlist;
import java.util.*;
class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;
    public Node(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return next;
    }
    public Node<T> getPrev(){
        return prev;
    }
    public void setData(T data){
        this.data = data;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    public void setPrev(Node<T> prev){
        this.prev = prev;
    }

}
public class DoublyLinked1<T>{
    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead(){
        return head;
    }
    public Node<T> getTail(){
        return tail;
    }
    public void insert(T data){
        Node<T> newnode = new Node<>(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        tail.setNext(newnode);
        newnode.setPrev(tail);
        tail = newnode;
    }
    public void insertAt(T data, int index){
        if(index == 0){
            Node<T> newnode = new Node<>(data);
            newnode.setNext(head);
            if(head!=null){
                head.setPrev(newnode);
            }
            head = newnode;
            if(tail == null){
                tail = newnode;
            }
            return;
        }
        Node<T> current = head;
        for(int i=0;current!=null && i<index-1;i++){
            current = current.getNext();
        }
        if(current==null){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> newnode = new Node<>(data);
        newnode.setNext(current.getNext());
        newnode.setPrev(current);
        if(current.getNext()!=null){
            current.getNext().setPrev(newnode);

        }
        current.setNext(newnode);
        if(newnode.getNext()==null){
            tail = newnode;
        }


    }
    public void delete(T data){
        if(head == null) return;
        if(head.getData().equals(data)){
            head = head.getNext();
            if(head!=null){
            head.setPrev(null);
        }
        else{
            tail = null;
        }
        return;
    }
    Node<T> current = head;
        while (current != null && !current.getData().equals(data)) {
        current = current.getNext();
    }
        if(current==null) return;
        if(current.getNext()!=null){
            current.getNext().setPrev(current.getPrev());
        }
        else{
            tail = null;
        }
        if(current.getPrev()!=null){
            current.getPrev().setNext(current.getNext());
        }

    }
    public boolean search(T data){
        Node<T> current = head;
        while(current!=null){
            if(current.getData().equals(data)){
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    public void printforward(){
        Node<T> current = head;
        while(current!=null){
            System.out.println(current.getData());
            current = current.getNext();
        }
        System.out.println("null");

    }
    public void printbackward(){
        Node<T> current = head;
        while(current!=null){
            System.out.println(current.getData());
            current = current.getPrev();
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        doublylinkedlist.DoublyLinked1<Integer> list = new doublylinkedlist.DoublyLinked1<>();

        list.insert(1);
        list.insert(20);
        list.insert(3);
        list.insertAt(1, 25);
        list.insertAt(2, 45);
        list.delete(20);

        System.out.println("Contains 45? " + list.search(45));

        list.printforward();
        list.printbackward();
    }
}