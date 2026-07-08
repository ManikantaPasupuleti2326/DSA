class Solution 
{
    public int heightChecker(int[] heights) 
    {
        int expected[]=new int[heights.length];
        int result=0;

        for(int i=0; i<heights.length; i++)
        {
            expected[i]=heights[i];
        }
        Arrays.sort(expected);

        for(int i=0; i<heights.length; i++)
        {
            if(heights[i] != expected[i])
            {
                result++;
            }
        }
        return result;
        
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
        int result=sol.heightChecker(arr);
        System.out.println(result);

        sc.close();
    }
}