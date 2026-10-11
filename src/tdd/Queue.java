package tdd;

public class Queue {

    String[] line = new String[10];
    int size = 0;


    public boolean isEmpty() {

        return size == 0;
    }

    public void enqueueItem(String item) {
        if (size >= line.length) {
            throw new IllegalArgumentException("line is full");
        }
        line[size] = item;
        size++;
    }
    public String peekItem() {
        if (isEmpty()) {
            throw new IllegalArgumentException("line is empty");
        }
        return line[0];
    }
    public int getSize() {
        return size;
    }
    public String dequeueItem() {
            if (size == 0) {
                throw new java.util.NoSuchElementException("Queue is empty");
            }
        String firstItem = line[0];
        for(int index = 0; index < size - 1; index++){
            line[index]  = line[index + 1];
        }
        line[size - 1] = null;
        size--;
return firstItem;

    }


}






