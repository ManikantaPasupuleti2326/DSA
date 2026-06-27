import java.util.*;
class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int longest=0;
        Arrays.sort(nums);
        if(nums.length == 0)
        {
            return 0;
        }
        int count=1;

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            else if(nums[i] == nums[i-1]+1)
            {
                count++;
            }
            else
            {
                longest=Math.max(longest, count);
                count=1;
            }
        }
        return Math.max(longest, count);
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