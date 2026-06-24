import java.util.*;

class Solution {

    public static int[] twoSum(int[] nums, int target) {

        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}