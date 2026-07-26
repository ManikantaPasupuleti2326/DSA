import java.util.Scanner;

class Solution
{
    public String mergeAlternately(String word1, String word2)
    {
        StringBuffer merged=new StringBuffer();
        int i=0;

        while(i < word1.length() || i< word2.length())
        {
            if(i < word1.length())
            {
                merged.append(word1.charAt(i));
            }
            if(i < word2.length())
            {
                merged.append(word2.charAt(i));
            }
            i++;
        }
        return merged.toString();
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String word1=sc.nextLine();
        String word2=sc.nextLine();

        Solution sol=new Solution();
        String result=sol.mergeAlternately(word1, word2);
        System.out.println(result);

        sc.close();
    }
}