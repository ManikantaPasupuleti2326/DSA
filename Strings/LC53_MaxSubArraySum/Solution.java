import java.util.Scanner;

class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int maxSum=nums[0];
        int currentSum=0;

        for(int i=0; i<nums.length; i++)
        {
            currentSum+=nums[i];

            if(currentSum > maxSum)
            {
                maxSum=currentSum;
            }

            if(currentSum < 0)
            {
                currentSum=0;
            }
        }
        return maxSum;      
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0; i<size; i++)
        {
            nums[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        int result=sol.maxSubArray(nums);
        System.out.println(result);

        sc.close();
    }
}