import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];

        while (i <= j) {
            if (nums[j] * nums[j] >= nums[i] * nums[i]) {
                result[k] = nums[j] * nums[j];
                j--;
            } else {
                result[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(sol.sortedSquares(nums)));
    }
}