package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    LinkedList headNode;
    @BeforeEach
    void startWith(){
        headNode = new LinkedList();
    }
    @Test
    void testThatIHaveANode_NodeIsEmpty(){
        assertTrue(headNode.isEmpty());
    }
    @Test
    void testThatDataCanBeAddedToTheHeadNode(){
        assertTrue(headNode.isEmpty());
        String data = "ola";
        headNode.addDataToNode(data);
        assertEquals("ola",headNode.getData());
    }

    @Test
    void testThatNewNodeCanBeCreated(){
        LinkedList newNode = new LinkedList();
        assertTrue(newNode.isEmpty());


    }
    @Test
    void testThatNewNodeCanBeCreatedAndDataCanBeAdded(){
        LinkedList newNode = new LinkedList();
        newNode.addDataToNode("mango");
        assertEquals("mango",newNode.getData());
    }
    @Test
    void testThatNewNodeCanBeJoinedToTheHeadNode() {
        LinkedList newNode = new LinkedList();
        newNode.addDataToNode("mango");
        assertEquals("mango", newNode.getData());
        headNode.setNext(newNode);
        assertEquals(newNode, headNode.getNext());
    }

    @Test
    void testThatThreeNodeCanBeJoined_OneCanBeRemoved(){
        headNode.addDataToNode("melon");
        LinkedList node1 = new LinkedList();
        node1.addDataToNode("apple");

        LinkedList node2 = new LinkedList();
        node2.addDataToNode("mango");

        LinkedList node3 = new LinkedList();
        node3.addDataToNode("orange");

        headNode.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        assertEquals(node1,headNode.getNext());
        assertEquals(node2,node1.getNext());
        assertEquals(node3,node2.getNext());

        node1.removeNode("mango");
        assertEquals(node3,node1.getNext());
        assertEquals("orange",node1.getNext().getData());

    }
    @Test
    void testThatDataInANodeCanBeChecked(){
        LinkedList node = new LinkedList();
        node.addDataToNode("yam");
        assertFalse(node.isEmpty());
        assertEquals("yam",node.getData());
    }






    }



