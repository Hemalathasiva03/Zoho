/*Question 3 :
Print the largest possible for the given string
Sample Input:
Enter the number of string to be entered = 2
Enter the string1 : abdf
Enter the string2 : hafd
Sample Output:
String1 : fdba
String2 : hfda
*/
import java.util.Arrays;
import java.util.Scanner;

public class Question_3_SA {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of string to be entered = ");
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter the String %d:",i+1);
            str[i]= sc.next();
        }
        for(int i=0;i<n;i++)
        {
            char[] c = str[i].toCharArray();
            Arrays.sort(c);
            System.out.printf("String %d:",i+1);
            for(int j=c.length-1;j>=0;j--)
            {
                System.out.print(c[j]);
            }
            System.out.println();
        }

    }
}