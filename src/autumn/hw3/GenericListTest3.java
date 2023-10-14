package autumn.hw3;

import autumn.hw2.SimpleStrNum;

import java.util.Iterator;
import java.util.Random;

public class GenericListTest3 {
    public static void main(String[] args) {
        final int length = 10;
        Random random = new Random();

        GenericList<SimpleStrNum> intList = new GenericList<>(length);
        for (int i = 0; i < length; i++)
            intList.add(new SimpleStrNum(Integer.toString(random.nextInt())));

        Iterator<SimpleStrNum> itr = intList.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
