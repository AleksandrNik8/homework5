/*
//Basic
//Task #1
//Necessary:
// 1. Create a file "my_first_file.txt ". On the first line write: "My grandmother", on the second: "reads the newspaper life"
// 2. Read the file, and display all the words of the file in one line
// Expected result: "My grandmother reads the newspaper life"
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\program\\progi\\lesson10Homework5Task01\\src\\text1.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        StringBuilder resultBuffered = new StringBuilder();
        while (bufferedReader.ready()) resultBuffered.append(bufferedReader.readLine()).append(" ");
        System.out.println(resultBuffered);
        bufferedReader.close();
    }
}