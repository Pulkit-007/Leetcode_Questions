import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n]; // Next Smaller Element
        int[] psee = new int[n]; // Previous Smaller Element
        long total = 0; // Use long to avoid overflow
        int MOD = (int)(1e9 + 7);

        // Fill NSE and PSE arrays
        nseFunc(arr, nse);
        pseeFunc(arr, psee);

        // Calculate the total sum of subarray minimums
        for (int i = 0; i < n; i++) {
            long left = i - psee[i];  // Count of subarrays ending at i where arr[i] is minimum
            long right = nse[i] - i;  // Count of subarrays starting at i where arr[i] is minimum
            total = (total + (left * right % MOD) * arr[i] % MOD) % MOD; // Use long to avoid overflow
        }

        return (int) total; // Return result as an integer
    }

    private void nseFunc(int[] arr, int[] nse) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
    }

    private void pseeFunc(int[] arr, int[] psee) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
    }
}
