import java.io.*;
import java.util.*;

public class A_Increase_or_Smash {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        // Your logic here
        int t = fs.nextInt();
        while (t-- > 0) {
            // solve each test case here
            int n = fs.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i< n; i++){
                arr[i] = fs.nextInt();
            }
            int ans = 0;
            int max_i = findMaxIndex(arr);
            int min = findMin(arr);
            while(arr[max_i] > 0){
                int diff = min;
                int curr_min = Integer.MAX_VALUE;
                for(int i = 0; i< n; i++){
                    arr[i] -= diff;
                    if(arr[i] >0 && arr[i] < curr_min){
                        curr_min = arr[i];
                    }
                }
                ans += 2;
                min = curr_min;
            }
            out.println(ans-1);
        }

        out.flush();
    }

    public static int findMaxIndex(int[] arr){
        int max = Integer.MIN_VALUE;
        int max_i = -1;
        int n = arr.length;
        for(int i = 0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
                max_i = i;
            }
        }
        return max_i;
    }

    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int num: arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }
}