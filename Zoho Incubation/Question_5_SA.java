/*Question 5:
Check whether the given string has characters of equal difference or
unequal difference.
Sample Input 1:
Enter the string : abcdefg
Sample Output 1:
Equal difference.
Sample Input 2:
Enter the string : adxz
Sample Output 2:
Unequal difference.
*/
import java.util.Scanner;

public class Question_5_SA {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the string : ");
    	String s1 = sc.nextLine();
         char[] c = s1.toCharArray(); // to convert string to char array
      int len=c.length;// length of the char array
      Boolean isEqual = false;
      //to compare next element with current element.
      //if the difference is 1 then given string is print "Equal" 
      //else print "Unequal"
      for(int i =0; i<len-1;i++){
          if(c[i+1] - c[i] ==  1){
              isEqual=true;
          }else{
              isEqual = false;
          }
      }
      if(isEqual)
      System.out.println("Equal difference.");
      else 
      System.out.println("Unequal difference.");
    }
}