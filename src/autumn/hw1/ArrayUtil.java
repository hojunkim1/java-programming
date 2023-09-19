package autumn.hw1;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
        return arr;
    }

    public static void print(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static int[] makeRandomArray(int num) {
        int[] arr = new int[num];
        Random random = new Random();
        for (int i = 0; i < num; i++)
            arr[i] = random.nextInt(100);
        return arr;
    }
}

class StaticEx {
    public static void main(String[] args) {
        int[] array1 = ArrayUtil.makeRandomArray(4);
        int[] array2 = ArrayUtil.makeRandomArray(6);
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
