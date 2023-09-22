public class P34_twoSum {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                System.out.println(new int[] { left + 1, right + 1 });
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }

        }
        System.out.println(new int[] { -1, -1 });
    }
}
