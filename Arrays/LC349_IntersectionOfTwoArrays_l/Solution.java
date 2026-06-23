import java.util.Scanner;

class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> hSet1=new HashSet<>();
        HashSet<Integer> resultSet=new HashSet<>();

        for(int n1 : nums1)
        {
            hSet1.add(n1);
        }
        for(int n2 : nums2)
        {
            if(hSet1.contains(n2))
            {
                resultSet.add(n2);
            }
            
        }

        int result[]=new int[resultSet.size()];
        int index=0;
        for(int n : resultSet)
        {
            result[index ++]=n;
        }

        return result;


    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int arr1[]=new int[size1];
        int arr2[]=new int[size2];
        for(int i=0;i<size1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<size2;i++)
        {
            arr2[i]=sc.nextInt();
        }

        Solution sol=new Solution();
        sol.intersection(arr1,arr2);

        sc.close();
    }
}