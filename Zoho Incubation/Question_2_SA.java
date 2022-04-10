/*Question 2 :
Print the following pattern for the given n:
Sample Input 1:
Enter the number = 3
Sample Output 2:
1 6 5
2 4
3
Sample Input 2:
Enter the number = 5
Sample Output 2:
1 12 11 10 9
2 13 15 8
3 14 7
4 6
5
*/
import java.util.Scanner;

public class Question_2_SA {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        int r=0,c=0,count=1,l=a,k=l;
        Integer[][] arr = new Integer[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
               arr[i][j]=0;
            }
        }

        while(r<l && c<k)
        {
            for(int i=r;i<k-r;i++)
            {
                arr[i][i+r]=count++;
            }l--;
            k--;
            for(int j=l-1;j>=r;j--)
            {
                arr[j][k]=count++;
            }
            for(int g=k-1;g>c+r;g--)
            {
                arr[c][g]=count++;
            }r++;
            l--;
            c++;
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(arr[i][j]!=0)
                    System.out.printf("%3d",arr[i][j]);
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}