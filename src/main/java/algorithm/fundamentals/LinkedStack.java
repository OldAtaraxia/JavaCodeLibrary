package algorithm.fundamentals;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * 一个底层是链表实现的Stack
 * @param <Item>
 */
public class LinkedStack<Item> implements Iterable<Item> {
    private int n; // size of Stack
    private Node first; // top of the stack

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

    // initializes an empty stack
    public LinkedStack() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    /** adds the item to this stack
     * @param item the item to add
     */
    public void push(Item item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    /**
     * Removes and returns the item most recently added to stack
     * @return the item most recently added
     * @throws java.util.NoSuchElementException if stack is empty
     */
    public Item pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }


    /**
     * Returns the item most recently added to stack
     * @return the item most recently added to stack
     * @throws java.util.NoSuchElementException if stack is empty
     */
    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * Returns a string representation of this stack
     * @return the sequence if items in the stack in LIFO order, separated by space
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        // 实现了iterator
        for (Item item : this) {
            s.append(item + " ");
        }
        return s.toString();
    }

    /**
     * 内部实现iterator
     */
    private class LinkedIterator implements Iterator<Item> {
        private Node current = first; // 直接保存"下一个Item"

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator();
    }
}
