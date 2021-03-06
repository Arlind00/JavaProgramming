package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice_3 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();

        if (length < 0) {
            System.out.println("Invalid Entry");
            System.exit(0);
        }

        int[] numbers = new int[length];      //array length is created according to users input

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();       // each input user provided during each execution of the loop, will be assigned to array
        }

        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
