package chapter1.array.merge2orderedarray;

import java.util.Scanner;

public class MergeTwoOrderedArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Enter the number of elements for Array1");
        int num1 = sc.nextInt();
        System.out.println("Enter " + num1 + " number of sorted numbers for Array1");
        int[] array1 = new int[num1];

        for (int i = 0; i < num1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the number of elements for Array2");
        int num2 = sc.nextInt();
        System.out.println("Enter " + num2 + " number of sorted numbers for Array2");
        int[] array2 = new int[num2];

        for (int i = 0; i < num2; i++) {
            array2[i] = sc.nextInt();
        }
        /*int[] array1 = {12,45,46,78,96};
        int[] array2 = {55,66,77,100};*/

        int[] ma = merge(array1, array2);
        System.out.println("The result is ");
        System.out.print("Array1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println("");

        System.out.print("Array2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println("");
        System.out.print("Merged Array : ");
        for (int i = 0; i < ma.length; i++) {
            System.out.print(ma[i] + ", ");
        }

    }

    public static int[] merge(int[] array1, int[] array2) {

        int[] merged = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                merged[k] = array1[i];
                i++;
            } else {
                merged[k] = array2[j];
                j++;
            }
            k++;
        }

        //copy array1 element
        while (i < array1.length) {
            merged[k] = array1[i];
            i++;
            k++;
        }

        //copy array2 element
        while (j < array2.length) {
            merged[k] = array2[j];
            j++;
            k++;
        }
        return merged;

    }
}
