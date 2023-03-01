import java.util.Random;
import java.util.Arrays; //for Task 2

public class Day3_T1_2 {
    public static void main(String[] args) {

        //Task 1
        //Create 3d array and store a multiplication table in it.
        int [][] numbers = new int[10][10]; //array dimension
        for (int num = 1; num <= 10; ++num) {
            for (int i = 1; i <= 10; ++i){
                System.out.printf("%d * %d = %d \n", num, i, num * i);
            }
        }

        //Task 2
        //Declare and initialize an array with four arbitrary whole numbers.
        Random rd = new Random(); // creating Random object
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10); // storing random integers in an array
            System.out.println(arr[i]); // printing each array element
        }
        //int[] array = new int[4];

        //Copy this array by iterating it.
        int[] new_arr = new int[4];
        System.out.println("Source Array : "+Arrays.toString(arr));

        for(int i=0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        System.out.println("New Array: "+Arrays.toString(new_arr));
        
        }
    }