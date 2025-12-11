package OneDay00000000000000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumDSA {

    public static int[] twoSumDSA(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7};
        int[] result = TwoSumDSA.twoSumDSA(nums, 13);
        System.out.println(Arrays.toString(result));
    }
}
