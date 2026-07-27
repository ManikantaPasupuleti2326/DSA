class Solution 
{
    public boolean isSubsequence(String s, String t)
    {
        int i=0;
        int j=0;
        int count=0;

        while(i < s.length() && j < t.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                count++;
                i++;
            }
            j++;
        }
        return count == s.length();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        Solution sol=new Solution();
        boolean result=sol.isSubsequence(s, t);
        System.out.println(result);


        sc.close();
    }
}