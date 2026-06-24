import java.util.Scanner;

class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int size=digits.length;
        for(int i=size-1;i>=0;i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
   
        }
        int result[]=new int[size+1];
        result[0]=1;
        return result;

    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int digits[]=new int[size];
        for(int i=0;i<size;i++)
        {
            digits[i]=sc.nextInt();
        }
        
        Solution sol=new Solution();
        int result[]=sol.plusOne(digits);
        System.out.println(result);


        sc.close();
    }
}