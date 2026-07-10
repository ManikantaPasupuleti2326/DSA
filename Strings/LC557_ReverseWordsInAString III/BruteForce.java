class Solution 
{
    public String reverseWords(String s) 
    {
        if(s == null || s.length() == 0)
        {
            return "";
        }
        
        String words[]=s.split("\\s+");
        
        StringBuilder sb=new StringBuilder();

        for(String word : words)
        {
            
            for(int i=word.length()-1; i>=0; i--)
            {
                char ch=word.charAt(i);
                sb.append(ch);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
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