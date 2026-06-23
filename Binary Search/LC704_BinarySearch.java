class BinarySearch
{
    public int search(int[] nums, int target) 
    {
        int left=0;
        int right=nums.length-1;
        for(int i=0; i<nums.length; i++)
        {
            int mid=(left+right)/2;
            if(target == nums[mid])
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }

        BinarySearch bs=new BinarySearch();
        bs.search(arr, target);

        sc.close();
    }
}