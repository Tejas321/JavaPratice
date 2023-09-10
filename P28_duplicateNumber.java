public class P28_duplicateNumber {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        int ans = findDuplicate(nums);
        System.out.println(ans);

    }

    static int findDuplicate(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length - 1; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }
        return nums[nums.length - 1];
    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
