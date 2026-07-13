import java.util.Scanner;

class Solution 
{
    public char findTheDifference(String s, String t) 
    {
        char arr[]=t.toCharArray();

        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            for(int j=0; j<arr.length; j++)
            {
                if(ch == arr[j])
                {
                    arr[j]='*';
                    break;
                }
            }
        }

        for(char ch : arr)
        {
            if(ch != '*')
            {
                return ch;
            }
        }
        return ' ';
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
}olu