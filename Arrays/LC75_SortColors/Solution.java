import java.util.*;

class Solution 
{
    public void sortColors(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        int mid=0;

        while(mid <= right)
        {
            if(nums[mid] == 0)
            {
                int temp=nums[left];
                nums[left]=nums[mid];
                nums[mid]=temp;

                left++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                int temp=nums[right];
                nums[right]=nums[mid];
                nums[mid]=temp;

                right--;
            }
        }        
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
        sol.sortColors(arr);
        
        sc.close();
    }
}