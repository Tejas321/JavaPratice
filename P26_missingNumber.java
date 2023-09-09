public class P26_missingNumber {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int ans = cyclicsort(nums);
        System.out.println(ans);
    }

    static int cyclicsort(int nums[]) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }

        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;

    }

    static void swap(int nums[], int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

    }
}
