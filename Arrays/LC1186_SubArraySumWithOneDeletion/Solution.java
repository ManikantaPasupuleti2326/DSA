import java.util.Scanner;

class Solution
{
    public int maximumSum(int[] arr)
    {
        int noDeletion = arr[0];
        int oneDeletion = 0;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            oneDeletion = Math.max(oneDeletion + arr[i], noDeletion);

            noDeletion = Math.max(arr[i], noDeletion + arr[i]);

            ans = Math.max(ans, Math.max(noDeletion, oneDeletion));
        }

        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        System.out.println(sol.maximumSum(arr));

        sc.close();
    }
}