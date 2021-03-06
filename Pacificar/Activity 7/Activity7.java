import java.util.Scanner;
import java.util.Arrays;

public class Activity7 {
    public static int array[];

    static void bubbleSort(int[] arr) {
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }

    }

    public static void main(String[] args) {

        System.out.println("****************************************");
        System.out.println("*  Written by: Natalie Jane Pacificar  *");
        System.out.println("*    Getting Min and Max Value from    *");
        System.out.println("*     an Array inputted by the User    *");
        System.out.println("****************************************\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: \n");
        int arraySize = sc.nextInt();
        array = new int[arraySize];

        for(int i=0; i < array.length; i ++){
            System.out.print("Enter num "+ (i+1)+ ": ");
            array[i]= sc.nextInt();
        }


        System.out.println("\nArray before Sorting");
        System.out.println(Arrays.toString(array));
        System.out.println("Array after Sorting");
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        int minValue = array[0];
        int maxValue = array[array.length-1];
        System.out.println("\nMinimum Value of Element in Array is: " + minValue);
        System.out.println("Maximum Value of Element in Array is: " + maxValue);
    }
}

//Attributions to my code
//I retrieved the Bubble Sort Algorithm from https://www.javatpoint.com/bubble-sort-in-java
