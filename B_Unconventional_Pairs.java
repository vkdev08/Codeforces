import java.io.*;
import java.util.*;

public class B_Unconventional_Pairs {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        // Your logic here
        int t = fs.nextInt();
        while (t-- > 0) {
            // solve each test case here
            int n = fs.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i< n; i++){
                arr[i] = fs.nextInt();
            }
            Arrays.sort(arr);
            int mx = Integer.MIN_VALUE;
            for(int i = 0; i< n-1;i++){
                int diff = arr[i+1] - arr[i++];
                if(diff > mx){
                    mx = diff;
                }
            }
            out.println(mx);
        }

        out.flush();
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