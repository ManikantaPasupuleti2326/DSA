import java.util.Scanner;

class Solution 
{
    public int[] getConcatenation(int[] nums) 
    {
        int ans[]=new int[nums.length+nums.length];
        for(int i=0; i<nums.length; i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
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
        sol.getConcatenation(nums);


        sc.close();
    }
}