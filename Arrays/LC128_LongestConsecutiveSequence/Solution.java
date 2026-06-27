import java.util.*;
class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        if(nums.length == 0)
        {
            return 0;
        }
        for(int num : nums)
        {
            set.add(num);
        }

        for(int num : set)
        {
            if(! set.contains(num-1))
            {
                int current = num;
                int count=1;
                while(set.contains(current+1))
                {
                    count++;
                    current++;
                }
                longest=Math.max(longest, count);
            }
        }
        return longest;


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