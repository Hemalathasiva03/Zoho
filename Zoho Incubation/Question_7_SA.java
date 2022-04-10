/*Question 7:
Print the distinct words in the given string.
Sample Input 1:
Enter the string : This is Zoho and Zoho is good
Sample Output 1:
The distinct words are : This is Zoho and good
Sample Input 2:
Enter the string : we develop software we craft software
Sample Output 2:
The distinct words are : we develop software craft
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Question_7_SA {
    public static void main(String args[]) {
    	System.out.print("Enter the string : ");
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.nextLine();
       HashMap<String,String> hashMap = new LinkedHashMap<String,String>();
        // To convert string to string array
       String[] s1Array = s1.split(" ");
       //Iterate the string array and put the value to the hash map
       //hash map only allow uniqe key
       for(String word : s1Array) {
    	   hashMap.put(word,word);
       }
       //Print the distinct words
       for(HashMap.Entry<String,String> map:hashMap.entrySet()) {
    	   System.out.print(map.getKey()+" ");
       }
         System.out.println();
    }
}