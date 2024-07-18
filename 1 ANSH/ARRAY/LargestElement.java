package Array.Easy;
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {


//          Brute Force Approach

//        int arr1[] =  {2,5,1,3,0};
//        System.out.println("The Largest element in the array is: " + sort(arr1));
//
//        int arr2[] =  {8,10,5,7,9};
//        System.out.println("The Largest element in the array is: " + sort(arr2));
//    }
//    static int sort(int arr[]) {
//        Arrays.sort(arr);
//        return arr[arr.length - 1];



//        Optimal Approach
        int arr1[] =  {2,5,1,3,0};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr1));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
    }
    static int findLargestElement(int arr[]) {
        int max= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max= arr[i];
            }
        }
        return max;
    }

    }

