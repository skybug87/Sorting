// Class: CS 5000
// Term: Summer 2017
// Name: Crystal Matheny
// Instructor: Dr. He
// Assignment#: 4 prblem 3
import java.util.*;

class SelectionSort2
{
   //Main function
   public static void main(String[] args)
   {
       //Scanner class object
       Scanner reader = new Scanner(System.in);
      
       System.out.print("\n Enter 10 double values: ");
      
       //Array to hold 10 double values
       double[] arr = new double[10];
      
       //Iterating over array
       for(int i=0; i<10; i++)
       {
           //Reading and storing values
           arr[i] = reader.nextDouble();
       }
      
       //Printing results
       System.out.println("\n Before Sorting: "); printArray(arr);
      
       //Selection sort algorithm
       SelectionSort2(arr);
      
       //Printing results
       System.out.println("\n After Sorting: "); printArray(arr);
   }
  
   //Selection sort algorithm
   public static void SelectionSort2(double[] arr)
   {     
       int index;
       double temp;
      
       //Iterating over array in reverse direction
        for (int i = arr.length - 1; i >= 0; i--)
        {
            index = i;
          
           //Iterating over remaining elements
            for (int j = i - 1; j >= 0; j--)
           {
               //Comparing for largest value
                if (arr[j] > arr[index])
               {
                   //Storing index
                    index = j;
               }
           }
          
           //Swapping largest element with last element
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
  
   //Printing array
   public static void printArray(double[] arr)
   {
       System.out.print("\n\n The array is: ");
      
       //Iterating over array
       for (double number : arr)
       {
           //Printing element
           System.out.print(" " + number);
       }
       System.out.println("\n");
   }
}