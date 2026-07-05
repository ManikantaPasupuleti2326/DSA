import java.util.Scanner;
import java.util.ArrayList;

class Solution 
{
    public List<String> summaryRanges(int[] nums) 
    {
        List<String> list= new ArrayList<>();

        if(nums.length == 0)
        {
            return list;
        }

        int start=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] != nums[i-1]+1)
            {
                if(start == nums[i-1])
                {
                    list.add(String.valueOf(start));
                }
                else
                {
                    list.add(start+"->"+nums[i-1]);
                }
                start = nums[i];
            }
        }

        if(start == nums[nums.length-1])
        {
            list.add(String.valueOf(start));
        }
        else
        {
            list.add(start + "->" + nums[nums.length - 1]);
        }
        
        return list;
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
        sol.summaryRanges(arr);

        sc.close();
    }
}