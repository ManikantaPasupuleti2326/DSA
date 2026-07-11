import java.util.Scanner;

class Solution 
{
    public int firstUniqChar(String s) 
    {
        LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(map.get(ch) == 1)
            {
                return i;
            }
        }
        return -1;
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Solution sol=new Solution();
        int result=sol.firstUniqChar(s);

        System.out.println(result);

        sc.close();
    }
}