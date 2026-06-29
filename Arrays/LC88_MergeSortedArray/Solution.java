class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        System.arraycopy(nums2, 0, nums1, m, n);

        for(int i=0; i<nums1.length-1; i++)
        {
            int minIndex=i;
            for(int j=i+1; j<nums1.length; j++)
            {
                if(nums1[minIndex] > nums1[j])
                {
                    minIndex=j;
                }
  
            }
            int temp=nums1[i];
            nums1[i]=nums1[minIndex];
            nums1[minIndex]=temp;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int nums1[]=new int[m+n];
        int nums2[]=new int[n];

        for(int i=0; i<nums1.length; i++)
        {
            nums1[i]=sc.nextInt();
        }
        for(int i=0; i<nums2.length; i++)
        {
            nums2[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.merge(nums1, m, nums2, n);




        sc.close();
    }
}