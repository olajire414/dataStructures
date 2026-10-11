package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MapTest {
    Map headNode;

    @BeforeEach
    void startWith(){
        headNode = new Map();
    }
    @Test
    void testThatMapNodeIsEmpty(){
        assertTrue(headNode.isEmpty());
    }

    @Test
    void testThatAMapCanContainsKeyAndValue(){
        Map node = new Map("ola","1");
        assertEquals("ola",node.getKey());
        assertEquals("1",node.getValue());

    }
    @Test
    void testThatICanHaveMultipleMapConnected(){
      Map node1 = new Map();
      Map node2 = new Map();
      Map node3 = new Map();

      headNode.setNext(node1);
      assertEquals(node1,headNode.getNext());
      node1.setNext(node2);
      assertEquals(node2,node1.getNext());
      node2.setNext(node3);
      assertEquals(node3,node2.getNext());
    }

    @Test
    void testThatKeyAndValueOfAMapCanBeSet(){
        headNode.setKey("age");
        headNode.setValue("20");
        assertEquals("age",headNode.getKey());
        assertEquals("20",headNode.getValue());
    }

    @Test
    void testThatAMapCanBeRemoved(){
        Map node1 = new Map("age","20");
        Map node2 = new Map("number","30");

        headNode.setNext(node1);
        node1.setNext(node2);
        assertEquals(node1,headNode.getNext());
        assertEquals(node2,node1.getNext());
        headNode.removeNode("age");
        assertEquals("number",headNode.getNext().getKey());



    }
    @Test
    void testThatANewMapCanBeInsertedAsTheHead(){
        Map node1 = new Map();
        Map node2 = new Map();
        Map replaceHead = new Map();

        replaceHead.setNext(headNode);
        headNode.setNext(node1);
        node1.setNext(node2);
        assertEquals(headNode,replaceHead.getNext());
        
    }


}
