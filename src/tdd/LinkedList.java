package tdd;

public class LinkedList {
    private String data;
    private LinkedList next;



    public LinkedList (){
        this.data = null;
        this.next = null;
    }

    public boolean isEmpty(){
        return this.data == null;
    }
    public void addDataToNode(String data) {
        this.data = data;

    }
    public String getData(){
        return data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public void removeNode(String data) {
        LinkedList current = this;
        while (current.getNext() != null ){
            if(current.getNext().getData() != null &&  current.getNext().getData().equals(data)){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.next;
            
            
        }
        
    }
}
