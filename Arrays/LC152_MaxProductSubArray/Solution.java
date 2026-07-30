import java.util.Scanner;

class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int maxProduct=nums[0];
        for(int i=0; i<nums.length; i++)
        {
            int product=1;
            for(int j=i; j<nums.length; j++)
            {
                product*=nums[j];
                if(product > maxProduct)
                {
                    maxProduct=product;
                }
            }
    
        }
        return maxProduct;
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