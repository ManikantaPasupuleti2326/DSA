import java.util.Scanner;

class Solution 
{
    public int[] shuffle(int[] nums, int n) 
    {
        int ans[]=new int[nums.length];
        for(int i=0; i<n; i++)
        {
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[i+n];
        }
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.shuffle(arr,n);

        sc.close();
    }
}