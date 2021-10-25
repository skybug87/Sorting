// Class: CS 5000
// Term: Summer 2017
// Name: Crystal Matheny
// Instructor: Dr. He
// Assignment#: 4 prblem 2

public class LinearSearch2 {
 
public static void main(String[] args) {

int list[] = new int[5];


Scanner input = new Scanner(System.in);

double totalout = list[0];

System.out.print("Enter List: ");
for (int i = 0; i < list.length; i++) {
list[i] = input.nextInt();
}

System.out.print( "total input is: ");           
for (int i = 0; i < list.length; i++) {
System.out.print( list[i] + " ");
}  

 ls = new linearsearch2();

System.out.print( "total matched is: ");           
for (int i = 0; i < list.length; i++) {
System.out.print(search(array, 14));
}

}}
 
 /** The method for finding a key in the list */
 public static int linearsearch2(int[] list, int key) {
 
 int key = 2;
 
 for (int i = 0; i < list.length; i++) {
 if (key == list[i])
 return i;
 }
 return -1;
}
}