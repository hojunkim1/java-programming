package autumn.hw3;

import autumn.hw4.GenericMethods;

import java.util.Comparator;
import java.util.Iterator;

public class GenericList<T> {

    private final T[] items;
    private int count = 0;

    public GenericList(int length) {
        items = (T[]) new Object[length];
    }

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public void sort(Comparator<? super T> c) {
        GenericMethods.genericSort(this.items, count, c);
    }

    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current < count;
        }

        @Override
        public T next() {
            if (this.hasNext())
                return items[current++];
            return null;
        }
    }
}
