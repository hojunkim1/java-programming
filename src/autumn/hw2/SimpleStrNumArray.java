package autumn.hw2;

import java.util.Arrays;
import java.util.Random;

public class SimpleStrNumArray implements Cloneable {

    SimpleStrNum[] strNumList;

    public SimpleStrNumArray(int n) {
        Random random = new Random();
        strNumList = new SimpleStrNum[n];
        for (int i = 0; i < n; i++)
            strNumList[i] = new SimpleStrNum(Integer.toString(random.nextInt()));
    }

    public static void main(String[] args) {
        SimpleStrNumArray sa = new SimpleStrNumArray(5);
        SimpleStrNumArray sa2 = sa.clone();
        System.out.println(sa);
        System.out.println(sa.equal(sa2));
        System.out.println(sa == sa2);
    }

    public boolean equal(SimpleStrNumArray obj) {
        // null 여부 확인
        if (obj == null) return false;

        // 배열 비교 메서드 사용
        return Arrays.equals(this.strNumList, obj.strNumList);
    }

    @Override
    public String toString() {
        return Arrays.toString(strNumList);
    }

    @Override
    public SimpleStrNumArray clone() {
        try {
            return (SimpleStrNumArray) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
