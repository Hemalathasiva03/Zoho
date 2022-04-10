/*Question 1:
Display the diagonal pattern for the string of odd length.
Sample Input 1:
Enter the string : racecar
Sample Output 1:
      e
    c   c
  a       a
r           r
  a        a
    c   c
      e
Sample Input 2 :
Enter the string : football
Sample Output 2:
Not Possible
*/
import java.util.Scanner;

public class Question_1_SA {
    public static void main(String args[]) {
    	System.out.print("Enter the string :");
    	Scanner sc = new Scanner(System.in);
    	String s1= sc.nextLine();
    	int len = s1.length();
    	if(len%2 == 0) {   //Check the String length is even
    		System.out.println("Not Possible");
    		return;
    	}
    	int a = len/2;
    	int inc=a;
    	String[] s1Array= s1.split("");
    	for(int i=0; i<=len/2;i++) {
    		for(int j=0; j<len;j++) {
    			if(j== a || j == inc)
    				System.out.print(s1Array[j]+"  ");
    			else
    				System.out.print("  ");
    		}
    		System.out.println();
    		inc++;
    		a--;
    	}
    	a=1;
    	inc=len-2;

    	for(int i=1; i<=len/2;i++) {
    		for(int j=0; j<len;j++) {
    			if(j==a || j == inc)
    				System.out.print(s1Array[j]+"  ");
    			else
    				System.out.print("  ");
    		}
    		System.out.println();
    		inc--;
    		a++;
    	}
    }
} 