// Class: CS 5000
// Term: Summer 2017
// Name: Crystal Matheny
// Instructor: Dr. He
// Assignment#: 4 prblem 4

import java.util.Scanner;

public class ColumnSorting {

public static void main(String[] args) {
// Declaring 2-Dimensional Array
double arr[][] = new double[3][3];

// Scanner object is used to get the inputs entered by the user
Scanner sc = new Scanner(System.in);

// Getting the 2-D matrix Entered by the user
System.out.println("Enter a 3x3 matrix row-by-row :");

for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr[0].length; j++) {
arr[i][j] = sc.nextDouble();
}
}

// Calling the method by passing the user entered matrix as input
arr = sortColumns(arr);

// Displaying the 3x3 matrix after sorting the column values
System.out.println("The Column sorted array :");
for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr[0].length; j++) {
System.out.print(arr[i][j] + "\t");
}
System.out.println();
}

}

// Method implementation which sorts the 2-D matrix based on columns
private static double[][] sortColumns(double[][] m) {
double temp;
for (int i = 0; i < m.length; i++) {
for (int j = 0; j < m[0].length - 1; j++) {
if (m[j][i] > m[j + 1][i]) {
temp = m[j][i];
m[j][i] = m[j + 1][i];
m[j + 1][i] = temp;
}

}
}
return m;
}

}