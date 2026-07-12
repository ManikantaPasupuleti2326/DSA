import java.util.Scanner;

class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        char arr[]=magazine.toCharArray();

        for(int i=0; i<ransomNote.length(); i++)
        {
            char ch=ransomNote.charAt(i);
            boolean found=false;

            for(int j=0; j<magazine.length(); j++)
            {
                if(arr[j] == ch)
                {
                    found=true;
                    arr[j]='#';
                    break;
                }
            }
            if(! found)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        Solution sol=new Solution();
        boolean result=sol.canConstruct(s1, s2);
        System.out.println(result);

        sc.close();
    }
}