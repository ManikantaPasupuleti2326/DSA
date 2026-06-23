import java.util.Scanner;
class Solution 
{
    public int[] moveZeroes(int[] nums) 
    {
        int index=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;

                index++;
            }
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
        sol.moveZeroes(arr);



        sc.close();
    }
}