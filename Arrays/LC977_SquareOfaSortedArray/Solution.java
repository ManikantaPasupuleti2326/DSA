import java.util.*;

class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int result[]=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;

        while(left <= right)
        {
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
            {
                result[index]=nums[left]*nums[left];
                left++;
            }
            else
            {
                result[index]=nums[right]*nums[right];
                right--;
            }
            index--;
        }
        return result;
        
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
        int ans[]=sol.sortedSquares(arr);
        System.out.println(Arrays.toString(ans));

        sc.close();
    }


}