class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int result=0;

        for(int i=0;i<nums.length;i++)
        {
            result^=nums[i];          
        }
        return result;
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        int result=sol.singleNumber(arr);



        sc.close();
    }
}