class Solution 
{
    public String reverseWords(String s) 
    {
        char arr[]=s.toCharArray();
        int start=0;

        for(int end=0; end<=arr.length; end++)
        {
            if(end == arr.length || arr[end] == ' ')
            {
                reverse(arr, start, end-1);
                start=end+1;
            }
            
        }
        return new String(arr);
    }

    public static void reverse(char[] arr, int left, int right)
    {
        while(left < right)
        {
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Solution sol=new Solution();
        String result=sol.reverseWords(s);
        System.out.println(result);


        sc.close();
    }
}