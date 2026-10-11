package tdd;

public class Arraylist {
    private String [] items = new String[10];
    private int size = 0;
    boolean isEmpty = true;

    public int getSize() {
        return size;
    }

    public void addItem(String item) {
         items[size] = item;
        size++;
    }
    public boolean isEmpty() {
        return isEmpty;
    }
    public String getItem(int index){
        if(items[index] == null || index > size){
            throw new IllegalArgumentException("no item at specified index");
        }
        return items[index];
    }

    public void removeItem(int index ){
        if(items[index] == null){
            throw new IllegalArgumentException("index is empty");
        }
for(int position = index; position < size-1; position++){
    items[position] = items[position + 1];
}
size--;
    }


    public void doubleArrayLength(int index,String item) {
        if (index >= items.length) {
            int newCapacity = Math.max(items.length * 2, index);
            String[] newArray = new String[newCapacity];
            for (int newIndex = 0; newIndex < items.length; newIndex++) {
                newArray[newIndex] = items[newIndex];
            }

            this.items = newArray;
        }
        this.items[index] = item;
    }

    }
