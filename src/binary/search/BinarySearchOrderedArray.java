package binary.search;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearchOrderedArray {

    public static void main(String[] args) {

        int[] sortedIntArray = new int[100];
        for(int i = 0 ; i<100; i++){
            sortedIntArray[i] = i+1;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to search within 1 to 100");
        int numberToSearch = sc.nextInt();
        binarySearch(sortedIntArray, numberToSearch);

    }

    private static void binarySearch(int[] sortedIntArray, int numberToSearch) {
        if(numberToSearch <0 || numberToSearch >100){
            System.out.println("You entered an invalid number. The number should be in the range 1-100");
            throw new InputMismatchException();
        }
        boolean isNumberFound = false;
        int low = 1;
        int high = 100;
        while(!isNumberFound){
            int mid = (low + high) / 2;
            if(numberToSearch == mid){
                System.out.println("Found");
                isNumberFound = true;
            }else if(numberToSearch > mid){ // 51 to 100
                low = mid + 1;
                System.out.println("Low is " + low);
            }else{
                high = mid -1;
                System.out.println("High is " + high);
            }
        }



    }
}
