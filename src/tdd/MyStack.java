package tdd;

public class MyStack {
        private int count;
        private String[] contents= new String[5];

        public boolean isEmpty(){

            return count == 0;
        }
        public void push(String element){

            contents[count++] = element;
        }
        public String pop(){;
            if(isEmpty()){
                throw new IllegalArgumentException("Stack is Empty");
            }
            return contents[--count];
        }
        public String peek(){
            if(isEmpty()){
                throw new IllegalArgumentException("Stack is empty");
            }

            return contents[count -1];
        }
        public int search(String element){
            for(int index = 0; index < contents.length; index++){
                if(contents[index] == element)
                    return index;
            }
            return -1;
        }

    }

