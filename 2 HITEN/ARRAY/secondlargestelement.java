// BRUTE FORCE APPROACH 

// import java.util.Arrays;

// class secondlargestelement {
//   static public void getElements(int[] arr, int n) {

//     // BASE CASE THAT < 2 Numbers honge toh empty hai arr so it will print -1 , -1

//     if (n < 2) {
//       System.out.println("-1 -1"); // Empty
//       return;
//     }

//     Arrays.sort(arr); // Inbuilt array method for sorting in ascending order

//     int small = arr[1]; // Will give smallest second element
//     int large = arr[n - 2]; // Will give largest second element

//     System.out.println("Second smallest is " + small);
//     System.out.println("Second largest is " + large);
//   }

//   public static void main(String[] args) {
//     int[] arr = { 1, 2, 4, 6, 7, 5 };
//     int n = arr.length;
//     getElements(arr, n);
//   }
// }

// Time Complexity: O(NlogN), For sorting the array
// Space Complexity: O(1)

// BETTER APPROACH
// import java.io.*;
// import java.util.Arrays;

// class Test {
// static private void getElements(int[] arr, int n) {

// // BASE CASE THAT < 2 Numbers honge toh empty hai arr so it will print
// if (n < 2) {
// System.out.println("-1 -1");
// return;
// }

// // Initialize Variables:
// int large = Integer.MIN_VALUE;   // Inbuilt methods that will compare with -∞
// int second_large = Integer.MIN_VALUE;

// int small = Integer.MAX_VALUE;  // Inbuilt methods that will compare with +∞ 
// int second_small = Integer.MAX_VALUE;
// int i;

// // First Loop - Find Smallest and Largest:

// for (i = 0; i < n; i++) {
// small = Math.min(small, arr[i]);
// large = Math.max(large, arr[i]);
// }

// // Second Loop - Find Second Smallest and Second Largest:

// for (i = 0; i < n; i++) {
// if (arr[i] < second_small && arr[i] != small) {
// second_small = arr[i];
// }
// if (arr[i] > second_large && arr[i] != large) {
// second_large = arr[i];
// }
// }

// System.out.println("Second smallest is " + second_small);
// System.out.println("Second largest is " + second_large);
// }

// public static void main(String[] args) {
// int[] arr = { 1, 2, 4, 6, 7, 5 };
// int n = arr.length;
// getElements(arr, n);
// }
// }

// Time Complexity: O(N), We do two linear traversals in our array
// Space Complexity: O(1)

// OPTIMAL APPROACH
import java.io.*;

class secondlargestelement {
  static private int secondLargest(int[] arr, int n) {
    if (n < 2)
      return -1;

    int large = Integer.MIN_VALUE;
    int second_large = Integer.MIN_VALUE;
    int i;

    for (i = 0; i < n; i++) {

      if (arr[i] > large) {
        second_large = large;
        large = arr[i];
      }

      else if (arr[i] > second_large && arr[i] < large) {
        second_large = arr[i];
      }
    }
    return second_large;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 4, 7, 7, 5 };
    int n = arr.length;
    int sL = secondLargest(arr, n);
    System.out.println("Second largest is " + sL);
  }

}

// Time Complexity: O(N), Single-pass solution
// Space Complexity: O(1)
