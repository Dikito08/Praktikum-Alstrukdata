public class DNode {
    String data;
    DNode next;
    DNode prev;
    public DNode(String data){
        this.data = data;
    }
    public void tampil(){
        System.out.print("{"+data+"}");
    }
}