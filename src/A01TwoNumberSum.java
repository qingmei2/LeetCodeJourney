/**
 * 1_两数之和
 * <p>
 * 给定一个整数数列，找出其中和为特定值的那两个数。
 * 你可以假设每个输入都只会有一种答案，同样的元素不能被重用。
 */
public class A01TwoNumberSum {

    /**
     * 示例:
     * <p>
     * 给定 nums = [2, 7, 11, 15], target = 9
     * <p>
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1, 2, 3, 4}, 3);
        System.out.println(String.format("the two number index is: %s , %s", ints[0], ints[1]));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
