/*Question 4:
Print the following pattern for the given input.
Input:
Enter the number : 5
Output:
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*/
import java.util.Scanner;  
import java.lang.Math;  

public class Question_4_SA 
{  
//function to print the spiral pattern  
public static void printPattern(int n)  
{  
//detrmines the boundary size of the array  
int size = 2 * n - 1;  
//inner loop  
for(int i = 1; i <= size; i++)  
{  
//outer loop      
for(int j = 1; j <= size; j++)  
{  
//calculates and prints the values for pattern  
System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
}  
System.out.println();  
}  
}  
//driver code  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number : ");  
int n = sc.nextInt();  
System.out.println();  
//function calling  
printPattern(n);  
}  
} 