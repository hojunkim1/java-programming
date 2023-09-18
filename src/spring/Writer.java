package spring;

import java.io.*;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");

        // 파일 생성
        if (file.createNewFile())
            System.out.println("File created: " + file.getName());
        else
            System.out.println("File already exists.");

        // 파일 쓰기
        FileWriter writer = new FileWriter(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        writer.write(br.readLine());
        writer.close();
        br.close();

        // 파일 읽기
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
            System.out.println(data);
        }
        reader.close();
    }
}
