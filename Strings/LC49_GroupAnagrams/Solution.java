import java.util.Scanner;
import java.util.Arrays;

class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, List<String>> map=new HashMap<>();
        for(String s : strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
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