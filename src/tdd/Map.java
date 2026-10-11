package tdd;

public class Map {

    private String key;
    private String value;
    private Map next;


    public Map(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Map() {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public boolean isEmpty() {
        return this.key == null;
    }

    public void setKey(String key) {
        this.key = key;

    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Map getNext() {
        return next;
    }

    public void setNext(Map node) {
        this.next = node;
    }

        public void removeNode(String key) {
            Map current = this;
            while (current.getNext() != null ){
                if(current.getNext().getKey() != null &&  current.getNext().getKey().equals(key)){
                    current.setNext(current.getNext().getNext());
                    return;
                }
                current = current.next;
            }
        }



    }




