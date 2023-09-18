package spring.hw5;

public class Person {
    private int age;

    public static void main(String[] args) {
        Person aPerson = new Person();
        aPerson.setAge(17);
        System.out.println(aPerson.getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
