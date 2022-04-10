import java.util.Scanner;
import java.util.Arrays;

public class Question_6_SA {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        int k=0,l=0,p=0,start=0,end=0;
        int flag1=1,flag2=1;
        char mid='0';
        char[] arr = str.toCharArray();
        char[] a = new char[str.length()];
        int[] b = new int[str.length()];   
        Arrays.sort(arr);
        //find count of letters
        for(int i=0;i< arr.length;i++)
        {
            int count=0;
            if(arr[i]!='0')
            {
                char temp=arr[i];
                for(int j=0;j< arr.length;j++)
                {
                    if(temp==arr[j])
                    {
                        arr[j]='0';
                        count++;
                    }
                }
                if(count>1)
                {
                    a[k++]=temp;
                    b[l++]=count;
                }
                else if (count==1 && flag1==1)
                {
                    a[k++]=temp;
                    b[l++]=count;
                    flag1=0;
                }
            }
        }

//print maximum possible palindrome
        System.out.println("Output :");
        for(int i=0;i<2;i++)
        {
            if(i==0)
            {
                for(int j=0;j<k;j++)
                {

                    p = b[j]/2;
                    if(p==0)
                    {
                        flag2=0;
                        mid=a[j];
                        continue;
                    }

                    for(int q=0;q<p;q++)
                    {
                        System.out.print(a[j]);
                    }
                }
            }
            else
            {
                for(int j=k-1;j>=0;j--)
                {
                    p = b[j]/2;
                    if(p==0)
                    {
                       continue;
                    }

                    for(int q=0;q<p;q++)
                    {
                        System.out.print(a[j]);
                    }
                }
            }

            if(i==0 && mid!='0')
            {
                System.out.print(mid);
                mid='0';
            }
        }
    }
}