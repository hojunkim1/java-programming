package autumn.hw4;

import java.util.Comparator;

public class GenericMethods {
    public static <T> void genericSort(T[] items, int count, Comparator<? super T> c) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = count - 1; j > i; j--) {
                if (c.compare(items[j - 1], items[j]) > 0) {
                    T t = items[j - 1];
                    items[j - 1] = items[j];
                    items[j] = t;
                }
            }
        }
    }
}
