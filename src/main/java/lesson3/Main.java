package lesson3;

import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) {
        Task1<String, DataInputStream,Integer> task1 = new Task1<>("text",new DataInputStream(System.in),9);
        task1.printName();
    }
}
