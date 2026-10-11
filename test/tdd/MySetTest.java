package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MySetTest {
    MySet lists;

    @BeforeEach
    void startWith(){
        lists = new MySet();
    }
    @Test
    void testThatSetIsEmpty(){
        lists.isEmpty();
        assertTrue(lists.isEmpty());
        assertEquals(0,lists.getSize());
    }

    @Test
    void testThatUniqueItemCanBeAddedToLis(){
        lists.addItem("mango");
        lists.addItem("apple");
        assertEquals(2,lists.getSize());

    }

    @Test
    void testThatNonUniqueItemInSetIsRejected(){
        lists.addItem("mango");
        lists.addItem("mango");
        lists.addItem("apple");
        assertEquals(2,lists.getSize());

    }
    @Test
    void testThatItemCamBeRemovedFromASet(){
        lists.addItem("orange");
        lists.addItem("mango");
        lists.addItem("apple");
        lists.removeItem("mango");
        assertEquals(2,lists.getSize());

    }



}
