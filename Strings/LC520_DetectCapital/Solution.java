import java.util.Scanner;
import java.util.Arrays;

class Solution 
{
    public boolean detectCapitalUse(String word) 
    {
        char arr[]=word.toCharArray();
        int upperCount=0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] >= 'A' && arr[i] <= 'Z')
            {
                upperCount++;
            }   
        }
        if(upperCount == 0)
        {
            return true;
        }
        else if(upperCount == arr.length)
        {
            return true;
        }
        else if(upperCount == 1 && arr[0] >= 'A' && arr[0] <= 'Z')
        {
            return true;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();

        Solution sol=new Solution();
        boolean result=sol.detectCapitalUse(word);
        System.out.println(result);

        sc.close();
    }
}