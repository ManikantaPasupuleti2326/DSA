import java.util.Scanner;

class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length <= 2)
        {
            return nums.length;
        }

        int k=2;
        for(int i=2; i<nums.length; i++)
        {
            if(nums[i] != nums[k-2])
            {
                nums[k]=nums[i];
                k++; 
            }
        }
        return k;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        int result=sol.removeDuplicates(arr);
        System.out.println(result);

        sc.close();
    }
}