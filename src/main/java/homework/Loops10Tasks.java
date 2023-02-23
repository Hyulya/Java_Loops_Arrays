package homework;

import java.util.Arrays;

public class Loops10Tasks {
    public static void main(String[] args) {

        // Task 1: Write a Java program to sum values of an array.
        int[] array = {1, 5, 10, 15, 20};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("Task 01:\nThe sum is: " + sum + "\n * * *\n");

        // Task 2: Write a Java program to copy an array by iterating the array.

        // NOTE: Arrays.toString() method is used to return a string representation of the contents of the specified array.
        // The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”).
        // Adjacent elements are separated by the characters “, ” (a comma followed by a space). It returns “null” if the array is null.
        // Arrays.toString() is parsing = this is when we convert one type to another type (like int to String)

        int[] array_given = {1, 2, 3, 4, 5}; // initializing
        int[] array_new = new int[5]; // declaring
        System.out.printf("Task 02:\nThe given array is: " + Arrays.toString(array_given) + "\n"); // escape symbols

        for (int k = 0; k < array_given.length; k++) {
            array_new[k] = array_given[k];
        }
        System.out.printf("The new array is: " + Arrays.toString(array_new) + "\n * * *\n");

        //Task 3: Write a Java program to insert an element (specific position) into an array.
        int array03[] = {1, 2, 4, 5, 6, 7};
        int index = 2;
        int value = 3;
        System.out.printf("Task 03:\nBefore inserting the additional element: " + Arrays.toString(array03) + "\n");
        for (int z = array03.length - 1; z > index; z--) {
            array03[z] = array03[z - 1];
        }
        array03[index] = value;
        System.out.printf("After inserting the additional element: " + Arrays.toString(array03) + "\n * * *\n");

        // Task 4: Write a Java program to remove a specific element from an array.
        int[] array04 = {25, 5, 55, 15, 35};

        System.out.println("Task 04:\nGiven Array : " + Arrays.toString(array04));

        int removeIndex = 2;

        for (int i = removeIndex; i < array04.length - 1; i++) {
            array04[i] = array04[i + 1];
        }
        System.out.println("Array after removing the third element: " + Arrays.toString(array04) + "\n* * *");

        // Task 5: Write a Java program to reverse an array of integer values.
        int array05[] = {1, 2, 3};
        System.out.println("Task 05:\nGiven array: ");
        for (int i = 0; i < array05.length; i++) {
            System.out.print(array05[i] + " ");
        }
        System.out.println("\nArray in reverse order: ");
        for (int i = array05.length - 1; i >= 0; i--) {
            System.out.print(array05[i] + " ");
        }

        // Task 6: Write a Java program to find the duplicate values of an array of integer values.
        int array06[] = {1, 2, 3, 4, 4, 4, 5, 6, 6, 7, 8};
        System.out.printf("\n* * *\nTask 06:\nDuplicate values of the array are: ");
        for (int p = 0; p < array06.length; p++) {
            for (int q = p + 1; q < array06.length; q++) {
                if (array06[p] == array06[q]) {
                    System.out.println(array06[p]);
                }
            }
        }
        // Task 7: Write a Java program to move all 0's to the end of an array.
        // Maintain the relative order of the other (non-zero) array elements.
        int array07[] = {0, 2, 3, 0, 12, 0};

        int array07new[] = new int[array07.length];

        int idx = 0;

        for (int i = 0; i < array07.length; i++) {

            if (array07[i] != 0) {
                array07new[idx] = array07[i];
                idx++;
            }
        }

        System.out.println("\n* * *\nTask 07:\nGiven array: " + Arrays.toString(array07));
        System.out.println("Updated array with moved zeros: " + Arrays.toString(array07new));

        // Task 8: Write a Java program to get the difference between the largest and smallest values in an array of integers.
        // The length of the array must be 1 and above.

        int array08[] = {2, 5, 3, 9, 8};
        Arrays.sort(array08);
        int difference = array08[array08.length - 1] - array08[0];
        System.out.println("* * *\nTask 08:\nThe difference between the biggest and smallest number in the array is: " + difference);

        // Task 9: Write a Java program to test if an array contains a specific value.
        int array09[] = {12, 13, 21, 12};
        int specificElement = 12;
        int counter = 0;

        for (int i = 0; i < array09.length; i++) {

            if (specificElement == array09[i]) {
                counter++;
                break;
            }
        }

        if (counter == 1) {
            System.out.println("* * *\nTask 09:\n" + specificElement + " exists in the array.\n* * *");
        } else {
            System.out.println(specificElement + " does not exist in the array.\n * * *");
        }

        //Task 10: Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

        System.out.println("Task 10:\nSum of the numbers giving the same output:\nFrom the first array -->");
        findPairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);

        System.out.println("* * * * * * * *\nFrom the second array -->");

        findPairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
    }

    public static void findPairs(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == num) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }

            }

        }
    }
}
