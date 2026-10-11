package tdd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue line;

    @BeforeEach
    void startWith() {
        line = new Queue();
    }

    @Test
    void testThatIHaveAQueue_IEnqueueAndPeekAtFirstElement() {
        line.enqueueItem("banana");
        line.enqueueItem("orange");
        line.enqueueItem("mango");

        assertEquals("banana", line.peekItem());
        assertEquals(3, line.getSize());
    }

    @Test
    void testThatIHaveAQueue_FifoOrderingOnDequeue() {
        line.enqueueItem("banana");
        line.enqueueItem("orange");
        line.enqueueItem("mango");

        assertEquals("banana", line.dequeueItem());
        assertEquals("orange", line.dequeueItem());
        assertEquals("mango", line.dequeueItem());
        assertEquals(0, line.getSize());
    }

   @Test
   void testThatIHaveAQueue_DequeueOnEmptyQueue_ThrowsException() {
      assertTrue(line.isEmpty());

        assertThrows(NoSuchElementException.class, () -> {
            line.dequeueItem();
      });
   }
}

