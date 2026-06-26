import java.util.Scanner;
import java.util.Arrays;

class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> ans=new ArrayList<>();
        boolean visited[]=new boolean[strs.length];

        for(int i=0; i<strs.length; i++)
        {
            if(visited[i])
            {
                continue;
            }
            List<String> list=new ArrayList<>();
            list.add(strs[i]);
            visited[i]=true;
            for(int j=i+1; j<strs.length; j++)
            {
                if(!visited[j] && isAnagram(strs[i],strs[j]))
                {
                    list.add(strs[j]);
                    visited[j]=true;
                }
                
            }
            ans.add(list);
        }

        return ans;
    }

    public static boolean isAnagram(String str1, String str2)
    {
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String strs[]=new String[size];
        for(int i=0; i<size; i++)
        {
            strs[i]=sc.next();
        }


        sc.close();
    }
}