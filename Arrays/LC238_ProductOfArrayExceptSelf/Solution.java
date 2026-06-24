import java.util.Scanner;
class Solution 
{
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;

        int[] ans = new int[n];

        ans[0] = 1;

        for(int i = 1; i < n; i++)
        {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for(int i = n - 1; i >= 0; i--)
        {
            ans[i] = ans[i] * suffix;
            suffix *= nums[i];
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int nums[]=new int[size];
        for(int i=0; i<nums.length; i++)
        {
            nums[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.productExceptSelf(nums);

        sc.close();
    }
}