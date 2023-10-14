package autumn.hw3;

import java.util.Iterator;

public class GenericListTest1 {
    public static void main(String[] args) {
        final int length = 10;

        GenericList<Integer> intList = new GenericList<>(length);
        for (int i = 0; i < length; i++)
            intList.add(i);

        Iterator<Integer> itr = intList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
