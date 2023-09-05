public class P22_mountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        int ans = peakIndexInMountainArray(arr);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                // we know mid+1>mid
                start = mid + 1;
            }
        }
        // at last start and end are pointing to same
        return end;
    }
}
