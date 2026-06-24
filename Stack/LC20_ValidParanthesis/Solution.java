import java.util.*;


class Solution
{
    public boolean isValid(String s) 
    {
        Stack<Character> stack=new Stack<>();

        for(char ch : s.toCharArray())
        {
            if(ch == '(' || ch=='{' || ch=='[')
            {
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top=stack.pop();
                if(ch == ')' && top != '(')
                {
                    return false;
                }
                if(ch == '}' && top != '{')
                {
                    return false;
                }
                if(ch == ']' && top != '[')
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();

        
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String brackets=sc.nextLine();
        Solution sol=new Solution();
        boolean result=sol.isValid(brackets);
        System.out.println(result);



        sc.close();
    }
}