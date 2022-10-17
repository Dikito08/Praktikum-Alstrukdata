import java.util.Scanner;
public class TugasQueue<T> {
    public static void main(String[] args) {
        QueueLinkedList<String> antrian = new QueueLinkedList<String>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Antrian : ");
        antrian.enqueue(input.nextLine());
        antrian.enqueue(input.nextLine());
        antrian.enqueue(input.nextLine());

        System.out.println("\nAntrian : " + antrian.toString());
        antrian.dequeue();
        System.out.println("Antrian : " + antrian.toString());
        antrian.dequeue();
        System.out.println("Antrian : " + antrian.toString());
    }
    private class Node{
        T item;
        Node next;

        Node(T t) {
            item = t;
            next = null;
        }
        public String toString () {
            return item.toString();
        }
    }
    private Node first, last;

    TugasQueue() {
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void enqueue(T t) {
        Node oldLast = last;
        last = new Node(t);
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
    }
    public T dequeue () {
        if (isEmpty()) {
            first = null;
        }
        if (first == last) {
            T t = (T) first.item;
            first = last = null;
            return t;
        }
        T t = (T) first.item;
        first = first.next;
        return t;
    }
    public String   toString() {
        if (first == null) {
            return null;
        }
        if (first == last) {
            return first.item.toString();
        }
        StringBuffer sb = new StringBuffer();
        Node cur = first;
        while (cur != last) {
            sb.append(cur.item.toString() + " ");
            cur = cur.next;
        }
        sb.append(last.item.toString());
        return sb.toString();
    }
}
