public class P24_fairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 1 };
        int[] bobSizes = { 2, 2 };
        int[] arr = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(arr);

    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[] = new int[2];
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sumA = sumA + aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sumB = sumB + bobSizes[i];
        }
        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = 0; j < bobSizes.length; j++) {
                if (sumA + bobSizes[j] - aliceSizes[i] == sumB - bobSizes[j] + aliceSizes[i]) {
                    ans[0] = aliceSizes[i];
                    ans[1] = bobSizes[j];
                    return ans;
                }

            }
        }
        return ans;
    }

}
