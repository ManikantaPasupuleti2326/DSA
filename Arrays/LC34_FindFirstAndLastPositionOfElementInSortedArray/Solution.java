import java.util.Scanner;

class Solution 
{
    public static int firstIndex(int[] nums, int target)
    {
        int left=0;
        int right=nums.length-1;
        int first=-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid] == target)
            {
                first=mid;
                right=mid-1;
            }
            else if(target < nums[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return first;
    }

    public static int lastIndex(int[] nums, int target)
    {
        int left=0;
        int right=nums.length-1;
        int last=-1;

        while(left<=right)
        {
            int mid=left+(right-left)/2;

            if(nums[mid] == target)
            {
                last=mid;
                left=mid+1;
            }
            else if(target < nums[mid])
            {
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return last;
    }

    public static int[] searchRange(int[] nums, int target) 
    {
        int firstOccurance=firstIndex(nums,target);
        int lastOccurance=lastIndex(nums, target);

        return new int[]{firstOccurance, lastOccurance};
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();

        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        searchRange(arr,target);

        sc.close();
    }
}