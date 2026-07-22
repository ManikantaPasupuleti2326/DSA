import java.util.Scanner;

class Solution 
{
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String str1="";
        String str2="";

        for(int i=0; i<word1.length; i++)
        {
            str1=str1+word1[i];
        }

        for(int i=0; i<word2.length; i++)
        {
            str2=str2+word2[i];
        }

        if(str1.equals(str2))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        String word1[]=new String[size1];
        for(int i=0; i<size1; i++)
        {
            word1[i]=sc.nextLine();
        }

        int size2=sc.nextInt();
        String word2[]=new String[size2];
        for(int i=0; i<size2; i++)
        {
            word2[i]=sc.nextLine();
        }

        Solution sol=new Solution();
        boolean result=sol.arrayStringsAreEqual(word1, word2);
        System.out.println(result);

        sc.close();
    }
}