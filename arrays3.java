import java.util.*;
import java.lang.Math;

public class arrays3 {

    int[] returnArr() {
        int arr[] = new int[] { 76, 27, 30, 12, 50 }; // returning array from the method
        return arr;
    }

    void printArr(int arr[]) { // passing array as an argument through method

        System.out.println("Using toString(), print arr = " + Arrays.toString(arr));// using toString() -> print full
                                                                                    // array

    }

    void randomvaluesofarray() {

        Random objofran = new Random();
        int arrayone[] = new int[15];

        for (int index = 0; index < arrayone.length; index++) {
            arrayone[index] = objofran.nextInt(15);
        }
        for (int arrayonespare : arrayone) {

            System.out.println("Random values are assigned to arrayone = " + arrayonespare);
        }
    }

    void searcharrayelement() {

        // searching an array element using if else condition

        int arraythree[] = new int[] { 15, 46, 67, 98, 50 };
        Scanner input = new Scanner(System.in);
        System.out.println("*** Searching  an array***\n");
        System.out.println("The size of an array = " + arraythree.length);
        System.out.println("\nEnter the element to be searched : ");
        int searcharrayelement = input.nextInt();

        for (int index = 0; index < arraythree.length; index++) {

            if (arraythree[index] == searcharrayelement) {
                System.out.println("50 was found at the index " + index);
            } else
                System.out.println("Not found ");
        }

    }

    /*
     * void arithmetic_Operation_On_Arrays() { int array1[3][3] = {{ 1, 2, 3
     * },{4,5,6}}; int array2[3][3] = {{7,8,9} ,{10,11,12} }; int array3[3][3] =
     * array1[3][3]+array2[3][3]; System.out.println("Add array1 & array2 = " +
     * array3[3][3]); }
     */

    public static void main(String[] args) {
        arrays3 obj = new arrays3();
        int arr[] = obj.returnArr(); // assign method to array
        obj.printArr(arr); // pass an array through method

        obj.randomvaluesofarray(); // call method
        obj.searcharrayelement(); // call method
        // obj.arithmetic_Operation_On_Arrays();// call method
        /*
         * int arraytwo[] =
         * System.out.println("Using parallersort(), to sort the array -> arraytwo = " +
         * Arrays.parallelSort(arraytwo));
         *
         * System.out.println("" + Arrays.fill(arr[], 30));
         */

    }
}