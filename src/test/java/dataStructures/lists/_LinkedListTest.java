package dataStructures.lists;

import org.junit.jupiter.api.Test;
import setup.dataStructures.lists._LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class _LinkedListTest {

    @Test
    void validateMyLinkedList(){
        _LinkedList linkedList = new _LinkedList(4);

        assertEquals(4, linkedList.getHead().getValue());
        assertEquals(4, linkedList.getTail().getValue());
        assertEquals(1, linkedList.getLength());
        linkedList.printList();
    }

    @Test
    void validateMyAppend(){
        _LinkedList linkedList = new _LinkedList(1);
        linkedList.append(3);
        linkedList.append(7);

        assertEquals(1, linkedList.getHead().getValue());
        assertEquals(7, linkedList.getTail().getValue());
        assertEquals(3, linkedList.getLength());
    }

    @Test
    void validateMyRemoveLast(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);
        linkedList.removeLast();

        assertEquals(12, linkedList.getHead().getValue());
        assertEquals(2, linkedList.getLength());
        assertEquals(88, linkedList.getTail().getValue());

        linkedList.removeLast();
        linkedList.removeLast();

        assertEquals(0, linkedList.getLength());
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());

        linkedList.removeLast();
        assertEquals(0, linkedList.getLength());
    }

    @Test
    void validateMyPrepend(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);
        assertEquals(3, linkedList.getLength());
        assertEquals(12, linkedList.getHead().getValue());

        linkedList.prepend(11);
        assertEquals(4, linkedList.getLength());
        assertEquals(11, linkedList.getHead().getValue());
        assertEquals(7, linkedList.getTail().getValue());
    }

    @Test
    void validateMyRemoveFirst(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);

        assertEquals(12, linkedList.getHead().getValue());
        assertEquals(7, linkedList.getTail().getValue());
        assertEquals(3, linkedList.getLength());

        linkedList.removeFirst();
        assertEquals(88, linkedList.getHead().getValue());
        assertEquals(7, linkedList.getTail().getValue());
        assertEquals(2, linkedList.getLength());

        linkedList.removeFirst();
        assertEquals(7, linkedList.getHead().getValue());
        assertEquals(7, linkedList.getTail().getValue());
        assertEquals(1, linkedList.getLength());

        linkedList.removeFirst();
        assertNull(linkedList.getHead());
        assertNull(linkedList.getTail());
        assertEquals(0, linkedList.getLength());
    }

    @Test
    void validateMyGet(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);

        assertNull(linkedList.get(-1));
        assertNull(linkedList.get(3));
        assertEquals(12, linkedList.get(0).getValue());
        assertEquals(88, linkedList.get(1).getValue());
        assertEquals(7, linkedList.get(2).getValue());
    }

    @Test
    void validateMySet(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);

        assertEquals(12, linkedList.get(0).getValue());
        assertEquals(88, linkedList.get(1).getValue());
        assertEquals(7, linkedList.get(2).getValue());

        assertFalse(linkedList.set(-1, 13));
        assertFalse(linkedList.set(3, 13));

        assertTrue(linkedList.set(2, 13));
        assertEquals(13, linkedList.get(2).getValue());
    }

    @Test
    void validateMyInsert(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);

        assertEquals(12, linkedList.get(0).getValue());
        assertEquals(88, linkedList.get(1).getValue());
        assertEquals(7, linkedList.get(2).getValue());

        linkedList.insert(1, 99);
        assertEquals(12, linkedList.get(0).getValue());
        assertEquals(99, linkedList.get(1).getValue());
        assertEquals(88, linkedList.get(2).getValue());
        assertEquals(7, linkedList.get(3).getValue());
    }

    @Test
    void validateMyRemove(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);
        linkedList.append(32);
        linkedList.append(9);

        assertNull(linkedList.remove(-1));
        assertNull(linkedList.remove(5));

        linkedList.remove(1);

        assertEquals(12, linkedList.get(0).getValue());
        assertEquals(7, linkedList.get(1).getValue());
        assertEquals(32, linkedList.get(2).getValue());
        assertEquals(9, linkedList.get(3).getValue());
        assertNull(linkedList.get(4));
    }

    @Test
    void validateMyReverse(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);
        linkedList.append(32);
        assertEquals(12, linkedList.get(0).getValue());
        assertEquals(88, linkedList.get(1).getValue());
        assertEquals(7 , linkedList.get(2).getValue());
        assertEquals(32, linkedList.get(3).getValue());


        linkedList.reverse();
        assertEquals(32, linkedList.get(0).getValue());
        assertEquals(7 , linkedList.get(1).getValue());
        assertEquals(88, linkedList.get(2).getValue());
        assertEquals(12, linkedList.get(3).getValue());
        assertNull(linkedList.get(4));
    }
}