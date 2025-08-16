package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExamples {

    public static void printArray() {

        String[] fruits = {"Apple", "Banana", "Orange", "Pomegranate"};
        System.out.println("\nAs Is");
        printArray(fruits);
        System.out.println("Array has a length=" + fruits.length);

        Arrays.sort(fruits);
        System.out.println("\nSorted");
        printArray(fruits);

        // foreach


        Arrays.fill(fruits, "Pineapple");
        System.out.println("\nFilled");
        printArray(fruits);
    }
    public static void printArray(String[] array) {

        for(String s : array) {
            System.out.print(s+ " ");
        }
    }
    public static void printArray(int[] array) {

        for(int i : array) {
            System.out.print(i+ " ");
        }
    }
    public static void makeArray(){

        var scanner = new Scanner(System.in);
        String[] foods ;

        System.out.print("How many items?: ");
        int size =scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];

        for(int i=0; i< foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i]=scanner.nextLine();
            
        }
        scanner.close();

        printArray(foods);

    }
    public static void searchIntArray() {

        int[] numbers  = {23, 43, 545, 23, 54, 32, 56, 87, 34};
        System.out.println("Your array is...");
        printArray(numbers);

        System.out.print("What do you want to search ?");
        var scanner = new Scanner(System.in);
        var target = scanner.nextInt();
        var isFound = false;

        for(int i=0; i<numbers.length; i++) {
            if(target==numbers[i]) {
                System.out.println("Your item " + target + " is found at index " + i);
                isFound=true;
                scanner.close();
                break;
            }

        }
        if (!isFound) {
            System.out.println("Your item " + target + " is NOT found ");
        }
        scanner.close();

    }
    public static void searchStringArray() {

        String[] fruits = {"Apple", "Banana", "Orange", "Pomegranate"};
        System.out.println("Your array is...");
        printArray(fruits);

        var scanner = new Scanner(System.in);
        var isFound = false;

        System.out.print("What do you want to search ?");
        var target = scanner.nextLine();

            for (int i = 0; i < fruits.length; i++) {

                if(fruits[i].equals(target)) {

                    isFound = true;
                    System.out.println("Your item "+ target + " is found at index " + i);

                    break;
                }

            }

        if(!isFound){
            System.out.println("Your item "+ target + " is NOT found. ");
        }
        System.out.println("Closing Scanner...");
        scanner.close();

    }
    public static double average(double... numbers) {

        if(numbers.length==0){
            return 0;
        }
        double sum =0;
        for(double num : numbers) {
            sum+=num;
        }

        return  sum / numbers.length;

    }


    public static void printTwoDArray() {

        String[] fruits = {"apples", "bananas", "oranges", "kiwis"};
        String[] vegetables = {"carrots", "potatoes", "beetroots", "onions"};
        String[] meats = {"beef", "pork", "chicken", "fish"};

        String[][] groceries = {fruits,vegetables,meats};
        for(String[] foods : groceries ) {

            for(String food : foods ) {
                System.out.println(food);
            }
        }

    }
}
