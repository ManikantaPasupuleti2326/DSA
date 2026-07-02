import java.util.Scanner;

class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.findKthLargest(arr, k);



        sc.close();
    }
}