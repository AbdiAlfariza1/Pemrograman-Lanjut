public class Main {

    public int[] Main (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Main solution = new Main();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.Main(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}