package org.okten.javacore;

import java.util.Iterator;
import java.util.List;

// Any class that implements Iterable<E> can be used in for loop
public class CustomIterable implements Iterable<String> {

    @Override
    public Iterator<String> iterator() {
        return List.of("text1", "text2", "text3").iterator();
    }
}
