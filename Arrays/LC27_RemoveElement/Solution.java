import java.util.Scanner;

class Solution {
    public static int removeElement(int[] nums, int val)
    {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != val)
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
        int nums[]=new int[size];
        int val=sc.nextInt();


        int k=removeElement(nums,val);
        System.out.println(k);
        for(int i=0;i<size;i++)
        {
            System.out.println(nums[i]+" ");
        }



        sc.close();
    }
}