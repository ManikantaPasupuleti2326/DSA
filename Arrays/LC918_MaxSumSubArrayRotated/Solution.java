import java.util.Scanner;

class Solution 
{
    public int maxSubarraySumCircular(int[] nums) 
    {
        int totalSum=0;
        int currentMaxSum=nums[0];
        int maxSum=nums[0];

        int currentMinSum=nums[0];
        int minSum=nums[0];

        for(int i=0; i<nums.length; i++)
        {
            totalSum=totalSum+nums[i];

            if(i > 0)
            {
                currentMaxSum=Math.max(nums[i], currentMaxSum+nums[i]);
                maxSum=Math.max(currentMaxSum, maxSum);

                currentMinSum=Math.min(nums[i], currentMinSum+nums[i]);
                minSum=Math.min(currentMinSum, minSum);
                
            }
        }
        if(maxSum < 0)
        {
            return maxSum;
        }

        return Math.max(maxSum, totalSum-minSum);

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
        int result=sol.maxSubarraySumCircular(nums);
        System.out.println(result);

        sc.close();
    }
}