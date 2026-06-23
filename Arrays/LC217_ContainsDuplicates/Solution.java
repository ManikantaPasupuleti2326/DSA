class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        HashSet<Integer> hSet=new HashSet<>();
        for(int n : nums)
        {
            if(hSet.contains(n))
            {
                return true;
            }
            hSet.add(n);
        }
        return false;
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
        sol.containsDuplicate(arr);

        sc.close();
    }
}