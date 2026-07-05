import java.util.Scanner;

class Solution {

    public int thirdMax(int[] nums) {

        Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {

            long n = num;

            // Skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {

                third = second;
                second = first;
                first = n;

            } else if (second == null || n > second) {

                third = second;
                second = n;

            } else if (third == null || n > third) {

                third = n;
            }
        }

        if (third == null) {
            return first.intValue();
        } else {
            return third.intValue();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();

        System.out.println(sol.thirdMax(arr));

        sc.close();
    }
}