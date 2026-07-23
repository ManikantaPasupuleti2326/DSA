import java.util.Scanner;

class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        String firstString=convert(s);
        String secondString=convert(t);

        return firstString.equals(secondString);
    }

    public String convert(String str)
    {
        StringBuilder result=new StringBuilder();

        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch == '#')
            {
                if(result.length() > 0)
                {
                    result.deleteCharAt(result.length()-1);
                }
            }
            else
            {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        Solution sol=new Solution();
        boolean result=sol.backspaceCompare(s, t);

        System.out.println(result);


        sc.close();

    }
}