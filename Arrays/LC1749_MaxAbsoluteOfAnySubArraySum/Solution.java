import java.util.Scanner;

class Solution 
{
    public int maxAbsoluteSum(int[] nums) 
    {
        int currentMax=nums[0];
        int maxSum=nums[0];
        int currentMin=nums[0];
        int minSum=nums[0];

        for(int i=1; i<nums.length; i++)
        {
            currentMax=Math.max(nums[i], currentMax+nums[i]);
            maxSum=Math.max(currentMax, maxSum);

            currentMin=Math.min(nums[i], currentMin+nums[i]);
            minSum=Math.min(currentMin, minSum);
        }
        return Math.max(maxSum, Math.abs(minSum));
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
        int result=sol.maxAbsoluteSum(nums);

        sc.close();
    }
}