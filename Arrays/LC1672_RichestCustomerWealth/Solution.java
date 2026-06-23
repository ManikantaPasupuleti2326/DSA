import java.util.Scanner;

class Solution 
{
    public int maximumWealth(int[][] accounts) 
    {
        int maxWealth=0;
        for(int i=0; i<accounts.length; i++)
        {
            int wealth=0;
            for(int j=0; j<accounts[i].length; j++)
            {
                wealth+=accounts[i][j];
            }

            if(wealth > maxWealth)
            {
                maxWealth=wealth;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int accounts[][]=new int[m][n];

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                accounts[i][j]=sc.nextInt();
            }
        }

        Solution sol=new Solution();
        sol.maximumWealth(accounts);



        sc.close();
    }
}