import java.util.Scanner;

class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int[] runningSum=new int[nums.length];
        runningSum[0]=nums[0];

        for(int i=1; i<nums.length; i++)
        {
            runningSum[i]=runningSum[i-1]+nums[i];
        }

        return runningSum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.runningSum(arr);

        sc.close();
    }
}