package tdd;

public class MySet {

    private String[] lists = new String[10];
    private int size = 0;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addItem(String item) {
            if(contains(item) || size >= lists.length){
                     return;
            }
            lists[size] = item;
            size++;
    }

    public boolean contains(String item){
        for(int index = 0; index < size; index++){
            if(lists[index] != null && lists[index].equals(item)){
                return true;
            }
        }
        return false;
    }

    public void removeItem(String item) {
        for (int index = 0; index < size; index++) {
            if (lists[index] != null && lists[index].equals(item)) {
                for( int index2 = index; index2 < size -1; index2++ ){
                    lists[index2] = lists[index2 + 1];
                }
                lists[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
