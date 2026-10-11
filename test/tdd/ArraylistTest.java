package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArraylistTest {
     Arraylist items;

    @BeforeEach
     void startWith(){
        items = new Arraylist();
    }

    @Test
    void testThatIHaveAnArraylist_IsEmpty() {

        assertTrue(items.isEmpty());

    }

    @Test
    void testThatIHaveArraylist_IncreasedWhenAnItemIsAdded(){
        items.addItem("book");
        items.addItem("shirt");
        items.addItem("Phone");
        assertEquals(3,items.getSize());
    }

    @Test
    void testThatIHaveAnArraylist_CanRemoveItemAtIndex(){
        items.addItem("book");
        items.addItem("shirt");
        items.addItem("Phone");
        items.removeItem(1);
        assertEquals(2,items.getSize());

    }

    @Test
    void testThatIHaveAnArraylist_ItCanDoubleItSize(){
        items.doubleArrayLength(11,"orange");
        assertEquals("orange",items.getItem(11));


    }

}
