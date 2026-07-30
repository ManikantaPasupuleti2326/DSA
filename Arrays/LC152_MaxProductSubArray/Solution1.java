import java.util.Scanner;

class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result=nums[0];

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] < 0)
            {
                int temp=maxProduct;
                maxProduct=minProduct;
                minProduct=temp;
            }

            maxProduct=Math.max(nums[i], maxProduct*nums[i]);
            minProduct=Math.min(nums[i], minProduct*nums[i]);
            result=Math.max(result, maxProduct);
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
        int result=sol.maxProduct(arr);
        System.out.println(result);

        sc.close();
    }
}