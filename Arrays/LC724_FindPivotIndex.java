class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int totalSum=0;
        for(int num : nums)
        {
            totalSum+=num;
        }

        int leftSum=0;
        for(int i=0; i<nums.length; i++)
        {
            int rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum)
            {
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
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
        sol.pivotIndex(arr);



        sc.close();
    }
}