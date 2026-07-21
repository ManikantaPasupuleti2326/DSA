import java.util.Scanner;

class Solution 
{
    public boolean buddyStrings(String s, String goal) 
    {
        if(s.length() != goal.length())
        {
            return false;
        }

// It is for finding the duplicates
        if(s.equals(goal))
        {
            for(int i=0; i<s.length(); i++)
            {
                for(int j=i+1; j<s.length(); j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        return true;
                    }
                }
            }
            return false;
        }


// For finding the Mis match pair
        int first=-1;
        int second=-1;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != goal.charAt(i))
            {
                if(first == -1)
                {
                    first=i;
                }
                else if(second == -1)
                {
                    second=i;
                }
                else
                {
                    return false;
                }
            }
        }

        if(first == -1 || second == -1)
        {
            return false;
        }

        return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);


    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String goal=sc.nextLine();

        Solution sol=new Solution();
        boolean result=sol.buddyStrings(s, goal);
        System.out.println(result);

        sc.close();
    }
}