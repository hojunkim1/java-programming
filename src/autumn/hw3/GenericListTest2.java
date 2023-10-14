package autumn.hw3;

import java.util.Iterator;
import java.util.Random;

public class GenericListTest2 {
    public static void main(String[] args) {
        final int length = 10;
        Random random = new Random();

        GenericList<Integer> intList = new GenericList<>(length);
        for (int i = 0; i < length; i++)
            intList.add(random.nextInt());

        Iterator<Integer> itr = intList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
