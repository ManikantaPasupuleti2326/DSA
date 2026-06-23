class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int temp=x;
        if(x < 0)
        {
            return false;
        }

        int rev=0;
        while(x > 0)
        {
            int rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(temp == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Solution sol=new Solution();
        boolean result=sol.isPalindrome(num);
        System.out.println(result);





        sc.close();
    }
}