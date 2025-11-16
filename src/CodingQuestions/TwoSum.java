package CodingQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{

    public static int[] twoSum(int[]nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++)
        {
            int difference = target - nums[i];
            if(map.containsKey(difference))
            {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


    public static void main(String[] args)
    {
        int[]nums = {2, 3, 4, 8, 9, 7};
        int[]result = TwoSum.twoSum(nums, 9);
        System.out.println(Arrays.toString(result));
    }

}
