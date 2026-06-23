import java.util.*;

class Solution 
{
    public int missingNumber(int[] nums) 
    {
        
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int missingNumber=0;
        int originalSum=0;
       


        for(int i=0;i<nums.length;i++)
        {
            originalSum+=nums[i];
    
        }
        missingNumber=totalSum-originalSum;




        return missingNumber;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];

        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }

        Solution sol=new Solution();

        int result=sol.missingNumber(nums);




        sc.close();
    }
}