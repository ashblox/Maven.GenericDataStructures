package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;


    public Stack(){
        elements = new ArrayList<>();
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public void push(E foobar) {
        elements.add(foobar);
    }

    public E pop() {
        int lastIndex = elements.size()-1;
        E element = elements.get(lastIndex);
        elements.remove(lastIndex);
        return element;
    }

}
