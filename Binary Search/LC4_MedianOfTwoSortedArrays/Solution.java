import java.util.*;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int m=nums1.length;
        int n=nums2.length;
        
        int result[]=new int[m+n];

        System.arraycopy(nums1,0,result,0,m);
        System.arraycopy(nums2,0,result,m,n);

        Arrays.sort(result);

        if(result.length % 2 == 0)
        {
            return (result[result.length/2-1]+result[result.length/2])/2.0;
        }
         else
        {
            return result[result.length/2];
        }
 
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int nums1[]=new int[m];
        for(int i=0;i<m;i++)
        {
            nums1[i]=sc.nextInt();
        }

        int n=sc.nextInt();
        int nums2[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums2[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        
        double median=sol.findMedianSortedArrays(nums1,nums2);
        System.out.println(median);

        sc.close();
    }
}