class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int n=nums.length;
        k=k%n;
        while(k > 0)
        {
            int last=nums[n-1];
            for(int i=n-1; i>0; i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=last;
            k--;
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