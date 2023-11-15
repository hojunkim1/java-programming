package autumn.hw4;

import autumn.hw3.GenericList;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        GenericList<Student> students = new GenericList<>(4);

        try (FileReader file = new FileReader("./student.txt")) {
            Scanner stdIn = new Scanner(file);

            while (stdIn.hasNextLine()) {
                String[] data = stdIn.nextLine().split(",");
                Student student = new Student();
                student.name = data[0];
                student.major = data[1];
                student.id = Integer.parseInt(data[2]);
                student.mean = Float.parseFloat(data[3]);
                students.add(student);
            }

            stdIn.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        students.sort((o1, o2) -> Float.compare(o1.mean, o2.mean));

        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            Student next = iter.next();
            System.out.println("이름:" + next.name);
            System.out.println("학과:" + next.major);
            System.out.println("학번:" + next.id);
            System.out.println("학점 평균:" + next.mean);
            System.out.println("--------------------");
        }
    }
}
