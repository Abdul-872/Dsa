public class Rotatebyk {
    class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle case when k > n
        // Step 1: make 2 arrays
        int[] part1 = new int[k];
        int[] part2 = new int[n - k];
        // fill part1 with last k elements
        for (int i = 0; i < k; i++) {
            part1[i] = nums[n - k + i];
        }
        // fill part2 with first n - k elements
        for (int i = 0; i < n - k; i++) {
            part2[i] = nums[i];
        }
        // Step 2: merge both parts into nums
        int index = 0;
        for (int i = 0; i < k; i++) {
            nums[index++] = part1[i];
        }
        for (int i = 0; i < n - k; i++) {
            nums[index++] = part2[i];
        }
    }
}

    
}
