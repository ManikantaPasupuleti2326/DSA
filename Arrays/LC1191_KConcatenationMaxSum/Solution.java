import java.util.Scanner;

class Solution 
{
    public static final int MOD=1000000007;
    public int kConcatenationMaxSum(int[] arr, int k) 
    {
        long totalSum=0;
        for(int i=0; i<arr.length; i++)
        {
            totalSum+=arr[i];
        }

        
        if(k == 1)
        {
            return (int) kadane(arr)%MOD;
            
        }
       

        int twoCopies[]=new int[2*arr.length];

        System.arraycopy(arr, 0, twoCopies, 0, arr.length);
        System.arraycopy(arr, 0, twoCopies, arr.length, arr.length);

        long max=kadane(twoCopies);
        if(totalSum > 0)
        {
            max+=(k-2)*totalSum;
        }

        return (int) (max%MOD);
    }

    public static long kadane(int arr[])
    {
        long currentSum=0;
        long maxSum=0;
        for(int i=0; i<arr.length; i++)
        {
            currentSum=Math.max(0, currentSum+arr[i]);
            maxSum=Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        int result=sol.kConcatenationMaxSum(arr, k);

        System.out.println(result);

        sc.close();
    }
}