package tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

        private MyStack myStack;
        @BeforeEach
        public void startWith(){

            myStack = new MyStack();
        }
        @Test
        public void testThatStackIsEmpty() {

            assertTrue(myStack.isEmpty());
        }
        @Test
        public void testIPushXAndTheStackIsNotEmpty(){
            assertTrue(myStack.isEmpty());
            myStack.push("orange");
            assertFalse(myStack.isEmpty());
        }
        @Test
        public void testIPushXAndPopTheStackIsEmpty(){
            assertTrue(myStack.isEmpty());
            myStack.push("orange");
            assertFalse(myStack.isEmpty());
            myStack.pop();
            assertTrue(myStack.isEmpty());
        }
        @Test
        public void testIPushOrangeMangoAndPopMangoOrange(){
            assertTrue(myStack.isEmpty());
            myStack.push("Orange");
            myStack.push("Mango");
            assertFalse(myStack.isEmpty());

            assertEquals("Mango", myStack.pop());
            assertEquals("Orange", myStack.pop());

        }
        @Test
        public void testPopEmptyStackThrowsException(){
            assertTrue(myStack.isEmpty());
            assertThrows(IllegalArgumentException.class,() -> myStack.pop());
        }
        @Test
        public void testPush3ElementsPeekToCheckTheLastElement(){
            assertTrue(myStack.isEmpty());
            myStack.push("Orange");
            myStack.push("Mango");
            myStack.push("Banana");

            assertEquals("Banana", myStack.peek());
        }
        @Test
        public void push3ElementsPop1PeekToCheckTheElementOnTop(){
            assertTrue(myStack.isEmpty());
            myStack.push("Mango");
            myStack.push("Orange");
            myStack.push("Banana");
            myStack.pop();
            assertEquals("Orange", myStack.peek());
        }
        @Test
        public void peekAnEmptyStackThrowsException(){
            assertTrue(myStack.isEmpty());
            assertThrows(IllegalArgumentException.class,() -> myStack.peek());
        }
        @Test
        public void searchForXReturnsThePositionInStack(){
            assertTrue(myStack.isEmpty());
            myStack.push("Mango");
            myStack.push("Orange");
            myStack.push("Banana");

            assertEquals(2, myStack.search("Banana"));
        }
        @Test
        public void searchForYReturnsMinus1_YNotInTheStack(){
            assertTrue(myStack.isEmpty());
            myStack.push("Mango");
            myStack.push("Banana");

            assertEquals(-1, myStack.search("Orange"));
        }
    }

