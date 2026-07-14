class Solution 
{
    public int longestPalindrome(String s) 
    {
        HashMap<Character, Integer> map=new HashMap<>();

        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int length=0;
        boolean isOddFound=false;
        for(int value : map.values())
        {
            if(value % 2 == 0)
            {
                length+=value;
            }
            else
            {
                length+=value-1;
                isOddFound=true;
            }
        }
        if(isOddFound)
        {
            length++;
        }
        return length;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        Solution sol=new Solution();
        int result=sol.longestPalindrome(s);
        System.out.println(result);

        sc.close();
    }
}