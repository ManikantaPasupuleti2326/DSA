import java.util.Scanner;

class Solution
 {
    public String longestCommonPrefix(String[] strs)
    {
        if(strs.length==0 || strs==null)
        {
            return "";
        }

        String preffix=strs[0];

        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(preffix))
            {
                preffix=preffix.substring(0,preffix.length()-1);

                if(preffix.isEmpty())
                {
                    return "";
                }
            }
        }
        return preffix;
        
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String strs[]=new String[size];

        for(int i=0;i<size;i++)
        {
            strs[i]=sc.nextLine();
        }

        Solution sol=new Solution();
        String result=sol.longestCommonPrefix(strs);
        System.out.println(result);




        sc.close();
    }
}