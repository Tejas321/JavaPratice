public class P18_cellingOfNumber {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 9, 10, 45, 67, 78 };
        int target = 40;
        int ans = celing(arr, target);
        System.out.println(ans);
    }

    static int celing(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }

}
