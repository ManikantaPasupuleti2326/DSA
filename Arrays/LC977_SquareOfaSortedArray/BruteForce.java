import java.util.*;

class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] < 0)
            {
                nums[i]=Math.abs(nums[i]);
            }
            
        }

        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++)
        {
            nums[i]*=nums[i];
        }

        return nums;
        
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
        sol.sortedSquares(arr);


        sc.close();
    }


}