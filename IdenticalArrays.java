// Class: CS 5000
// Term: Summer 2017
// Name: Crystal Matheny
// Instructor: Dr. He
// Assignment#: 4 prblem 5

import java.util.Scanner;

public class IdenticalArrays {

  
public static void main(String[] args) {
int m1[][]=new int[3][3]; //initialize two dimensional array m1
int m2[][]=new int[3][3]; //initialize two dimensional array m2
Scanner sc=new Scanner(System.in); //scanner class to get user input
char ch='y';

do{
System.out.println("Enter list1: ");

for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
m1[i][j]=sc.nextInt(); //get array list m1
}

System.out.println("Enter list2: ");

for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
m2[i][j]=sc.nextInt(); //get array list m2
}

if(equals(m1,m2)) //checks for indentical
System.out.println("The two arrays are identical");
else
System.out.println("The two arrays are not identical");
//re-input array
System.out.println("Do you want to continue 'y' for yes. 'n' for no");
ch=sc.next().charAt(0);

}while(ch=='y');
}
//if two arrays list identical return true else return false
private static boolean equals(int[][] m1, int[][] m2) {
for(int i=0;i<3;i++){
for(int j=0;j<3;j++)
if(!(m2[i][j]==m1[i][j]))
return false;
}
return true;
}
  
}