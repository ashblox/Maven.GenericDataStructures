package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements;

    public GenericStack() {
    }

    public boolean isEmpty() {
        return elements == null || elements.length == 0;
    }

    @SuppressWarnings("unchecked")
    public void push(E foobar) {
        if (elements == null) {
            elements = (E[]) Array.newInstance(foobar.getClass(), 1);
            elements[0] = foobar;
        } else {
            E[] arrToCopyInto = (E[])Array.newInstance(foobar.getClass(), elements.length + 1);
            System.arraycopy(elements, 0, arrToCopyInto, 0, elements.length);
            arrToCopyInto[elements.length] = foobar;
            elements = arrToCopyInto;
        }
    }

    public E pop() {
        E element = null;
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Array contains no elements");
        } else{
            element = elements[elements.length - 1];
        }
        elements = Arrays.copyOfRange(elements, 0, elements.length - 1);
        return element;
    }
}
