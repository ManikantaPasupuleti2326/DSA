import java.util.Scanner;

class Solution 
{
    public String reverseWords(String s) 
    {
        StringBuffer sb=new StringBuffer();
        String words[]=s.trim().split("\\s+");

        for(int i=words.length-1; i>=0; i--)
        {
            sb.append(words[i]);
            if(i != 0)
            {
                sb.append(" ");
            }
        }

        return sb.toString();
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