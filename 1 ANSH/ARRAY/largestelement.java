
import java.util.*;
public class largestelement {
 
  public static void main(String args[]) {
 //Brute force Approach
 // TC = O(nlogn)
 // SC = O(1)
    int arr1[] =  {1, 8, 7, 56, 90};
    System.out.println("The Largest element in the array is: " + sort(arr1));



//Optimized Approach (Recusrsive Approach)
// TC = O(N)
// SC = O(1)
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
   
  }

  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }

  static int findLargestElement(int arr[]) {
    int max= arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max= arr[i];
      }
    }
    return max;
  }
}

