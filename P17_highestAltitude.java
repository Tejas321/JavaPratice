public class P17_highestAltitude {

    public int largestAltitude(int[] gain) {
        int ans = 0;
        int max = 0;
        for (int ele : gain) {
            ans += ele;
            if (ans > max) {
                max = ans;
            }
        }
        return max;
    }
}