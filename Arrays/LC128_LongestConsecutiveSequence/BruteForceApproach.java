import java.util.*;
class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int longest=0;
        for(int i=0; i<nums.length; i++)
        {
            int current=nums[i];
            int count=1;

            while(linearSearch(nums, current+1))
            {
                count++;
                current++;
            }
            longest=Math.max(longest, count);
        }
        return longest;
    }

    public boolean linearSearch(int[] nums, int target)
    {
        for(int num : nums)
        {
            if(num == target)
            {
                return true;
            }
        }
        return false;
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
        sol.longestConsecutive(arr);



        sc.close();
    }
}