import java.util.Scanner;


class Solution
{
    public static int searchInsert(int[] nums, int target) 
    {
        int low=0;
        int high=nums.length-1;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int target=sc.nextInt();
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int result=searchInsert(arr,target);
        System.out.println(result);



        sc.close();
    }
}