package lab2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Word Test");
        Library demo = new Library();
        System.out.println(Arrays.toString(demo.roll(5)));

        int [] arr = new int[]{1,2,3,4};
        System.out.println(demo.containsDuplicates(arr));
    }
}
