public class DoubleLinkedList {
    DNode first;
    DNode last;
    //kontruktor
    //set nilai awal adalah null
    public DoubleLinkedList() {
        first = null;
        last = null;
    }
    //mengecek apakah linked list kosong atau tidak
    public boolean isEmpty(){
        return (first==null);
    }
    //method untuk menginsert data dari pertama
    public void insertFirst(String data){
        DNode node = new DNode(data);
        if(isEmpty()){
            last = node;
        }else{
            first.prev = node;
        }
        node.next = first;
        first = node;
    }
     //method untuk menginsert data dari terakhir
     public void insertLast(String data){
        DNode node = new DNode(data);
        if( isEmpty() )
            first = node;
        else{
            last.next = node;
            node.prev = last;
        }
        last = node;
    }
    //method untuk menginsert data pertama
    public DNode deleteFirst(){
        DNode temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.prev = null;
        first = first.next;
        return temp;
    }
    //method untuk menghapus data terakhir
    public DNode deleteLast(){
        DNode temp = last;
        if(first.next == null)
            first = null;
        else
            last.prev.next = null;
        last = last.prev;
        return temp;
    }
     //method untuk menginsert data di tengah
     public boolean insertAfter(String key, String data){
        DNode current = first;
        while(current.data != key){
            current = current.next;
            if(current == null)
            return false;
        }
        DNode node = new DNode(data);
        if(current==last){
            node.next = null;
            last = node;
        }else{
            node.next = current.next;
            current.next.prev = node;
        }
        node.prev = current;
        current.next = node;
        return true;
    }
     //method untuk menghapus data yang dipilih
     public DNode deleteKey(String key){
        DNode current = first;
        while(current.data != key){
            current = current.next;
        if(current == null)
            return null;
        }
        if(current==first)
            first = current.next;
        else
            current.prev.next = current.next;
        if(current==last)
            last = current.prev;
        else
            current.next.prev = current.prev;
            return current;
    }
     //menampilkan data dari pertama - terakhir
     public void displayForward(){
        System.out.print("List (first-->last): ");
        DNode current = first;

        while(current != null){
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }
     //menampilkan data dari terakhir - pertama
     public void displayBackward(){
        System.out.print("List (last-->first): ");
        DNode current = last;
        while(current != null){
            current.tampil();
            current = current.prev;
        }
        System.out.println("");
    }
}