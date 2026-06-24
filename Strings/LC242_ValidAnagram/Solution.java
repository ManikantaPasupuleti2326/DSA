import java.util.*;
import java.util.Arrays;
class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        char arr1[]=s.toCharArray();
        char arr2[]=t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();

        Solution sol=new Solution();
        boolean result=sol.isAnagram(str1,str2);
        System.out.println(result);






        sc.close();
    }
}