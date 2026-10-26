package tasks;
 java.util.Scanner;


     public class tasks {

    public class main {
public static void main(String[] args){
	     Scanner sc = new Scanner(System.in); // For taking user input
	     int[] arr = new int[10]; // Declare array of 10 integers

	     // Taking input for array
	     System.out.println("Enter 10 integers:");
	     for (int i = 0; i < arr.length; i++) {
	         arr[i] = sc.nextInt(); // Store each input at index i
	     }

	     // Displaying all elements
	     System.out.print("Array elements: ");
	     for (int i = 0; i < arr.length; i++) {
	         System.out.print(arr[i] + " "); // Print element at i
	     }

	     // Displaying in reverse order
	     System.out.print("\nReverse order: ");
	     for (int i = arr.length - 1; i >= 0; i--) {
	         System.out.print(arr[i] + " "); // Start from last index
	     }
	     sc.close();
	 }
	}
     }

// new tasks

	public class Task02 {
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 9, 1, 8, 1, 3}; // Example array
	        int max = arr[0], min = arr[0]; // Assume first is max and 
	        int maxIndex = 0, minIndex = 0;
	        int secondMin = Integer.MAX_VALUE;

	        // Find max and 
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) { max = arr[i]; maxIndex = i; }
	            if (arr[i] < min) { min = arr[i]; minIndex = i; }
	        }
	        // Find second 
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > min && arr[i] < secondMin) {
	                secondMin = arr[i]; // Greater than  but smallest among rest
	            }
	        }
	        System.out.println("Max: " + max + " at index " + maxIndex);
	        System.out.println("Min: " + min + " at index " + minIndex);
	        System.out.println("Second Min: " + secondMin);
	    }
	}







	//new task
package Assiment1;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[11]; // 10 + 1 extra space
        System.out.println("Enter 10 numbers:");
        for(int i=0; i<10; i++) arr[i] = sc.nextInt();
        
        System.out.print("Enter index to insert (0-9): ");
        int index = sc.nextInt();
        System.out.print("Enter value: ");
        int val = sc.nextInt();
        
        // Shift elements to right from index
        for(int i=9; i>=index; i--) {
            arr[i+1] = arr[i]; // Move element one step right
        }
        arr[index] = val; // Insert new value
        
        for(int i=0; i<11; i++) System.out.print(arr[i]+" ");
    }
}


// new task
package Assiment1;

public class task4 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5}; // Sorted array 1
        int[] b = {2, 4, 6}; // Sorted array 2
        int[] c = new int[a.length + b.length]; // Merged array
        
        int i=0, j=0, k=0; // Pointers for a, b, c
        // Compare and merge
        while(i < a.length && j < b.length) {
            if(a[i] <= b[j]) { // If a's element is smaller
                c[k++] = a[i++]; // Put a's element in c
            } else {
                c[k++] = b[j++]; // Put b's element in c
            }
        }
        // Copy remaining elements of a
        while(i < a.length) { c[k++] = a[i++]; }
        // Copy remaining elements of b
        while(j < b.length) { c[k++] = b[j++]; }
        
        for(int x : c) System.out.print(x+" "); // Display sorted merged
    }
}