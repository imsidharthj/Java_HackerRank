import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3};
        String [] stringarray = {"Hello", "World"};
        for (Integer element : integerArray) {
            System.out.printf("%d%n", element);
        }
        for (String element : stringarray) {
            System.out.printf("%s%n", element);
        }
    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}