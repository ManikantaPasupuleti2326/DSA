class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);


    }

    public static void reverse(int[] nums, int left, int right)
    {
        while(left < right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int size=sc.nextInt();

        int arr[]=new int[size];
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.rotate(arr, k);


        sc.close();
    }
}