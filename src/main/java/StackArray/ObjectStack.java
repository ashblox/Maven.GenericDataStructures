package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {

    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }

    public void push(E foobar) {
        Object[] arrToCopyInto = new Object[elements.length + 1];
        System.arraycopy(elements, 0, arrToCopyInto, 0, elements.length);
        arrToCopyInto[elements.length] = foobar;
        elements = arrToCopyInto;
    }

    public E pop() {
        E element;
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Array contains no elements");
        } else {
            element = (E)elements[elements.length - 1];
            elements = Arrays.copyOfRange(elements, 0, elements.length - 1);
        }
        return element;
    }
}
