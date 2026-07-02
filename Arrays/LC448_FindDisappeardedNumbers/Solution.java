import java.util.Scanner;

class Solution 
{
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
        {
            int index=Math.abs(nums[i])-1;
            if(nums[index] > 0)
            {
                nums[index]=-nums[index];
            }
        }

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] > 0)
            {
                list.add(i+1);
            }
        }
        return list;
        
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
        sol.findDisappearedNumbers(arr);


        sc.close();
    }
}