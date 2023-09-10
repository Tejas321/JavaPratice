import java.util.ArrayList;

public class P27_findAllMissingNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 5, 7, 8, 2, 3, 1 };
        int i = 0;
        while (i < nums.length) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        System.out.println(ans);
        ;

    }

    static void swap(int nums[], int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
