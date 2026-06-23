import java.util.Scanner;

class Solution 
{
    public static int lengthOfLastWord(String s) 
    {
        int count=0;
        
        for(int i=s.length()-1; i >= 0; i--)
        {
            if(s.charAt(i) == ' ' && count == 0)
            {
                continue;
            }
            if(s.charAt(i) == ' ')
            {
                break;
            }
            count++;
        }
        return count;

        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int result=lengthOfLastWord(str);

        System.out.println(result);



        sc.close();
    }
}