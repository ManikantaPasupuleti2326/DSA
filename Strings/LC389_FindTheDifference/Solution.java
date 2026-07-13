import java.util.Scanner;

class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        char result=0;

        for(char ch : s.toCharArray())
        {
            result^=ch;
        }
        for(char ch : t.toCharArray())
        {
            result^=ch;
        }

        return result;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        Solution sol=new Solution();
        char result=sol.findTheDifference(s,t);
        System.out.println(result);

        sc.close();
    }
}