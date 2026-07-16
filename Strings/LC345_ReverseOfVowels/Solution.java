import java.util.Scanner;

class Solution 
{
    public String reverseVowels(String s) 
    {
        char arr[]=s.toCharArray();
        int left=0;
        int right=s.length()-1;

        while(left < right)
        {
            while(left < right && !isVowel(arr[left]))
            {
                left++;
            }
            while(left < right && !isVowel(arr[right]))
            {
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left ++;
            right--;

        }
        return new String(arr);
    }
    public static boolean isVowel(char ch)
    {
        return ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Solution sol=new Solution();
        String result=sol.reverseVowels(s);
        System.out.println(result);

        sc.close();
    }
}