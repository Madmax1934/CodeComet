package org.example.Misc;

import java.util.Iterator;
import java.util.List;

public class Customiterator<T> implements Iterator<T> {

    private List<T> list;
    private int customindex=0;
    public Customiterator(List<T> list1) {
        this.list=list1;
        this.customindex=0;
    }

    @Override
    public boolean hasNext() {
          return customindex<list.size();
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new IndexOutOfBoundsException("No more elements in the list..");

        return list.get(customindex++);
    }
}
