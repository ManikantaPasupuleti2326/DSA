import java.util.Scanner;


class Solution 
{
    public int majorityElement(int[] nums) 
    {
        HashMap<Integer, Integer> hMap=new HashMap<>();
        for(int n : nums)
        {
            hMap.put(n,hMap.getOrDefault(n,0)+1);
        }

        for(int n : hMap.keySet())
        {
            if(hMap.get(n) > nums.length/2)
            {
                return n;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        Solution sol=new Solution();

        sol.majorityElement(arr);



        sc.close();
    }
}