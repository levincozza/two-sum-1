import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numAddToGetTarget = new HashMap<>();
        int[] twoSum = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (numAddToGetTarget.containsKey(nums[i])) {
                twoSum[0] = numAddToGetTarget.get(nums[i]);
                twoSum[1] = i;
                break;
            }
            numAddToGetTarget.put(target-nums[i], i);
        }
        return twoSum;
    }
}
