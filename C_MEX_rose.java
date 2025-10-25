import java.io.*;
import java.util.*;

public class C_MEX_rose {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        // Your logic here
        int t = fs.nextInt();
        while (t-- > 0) {
            // solve each test case here
            int n = fs.nextInt();
            int k = fs.nextInt();
            int cnt_k = 0;
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i = 0; i< n; i++){
                int num = fs.nextInt();
                if(num == k){
                    cnt_k ++;
                }
                set.add(num);
            }
            int ans = 0;
            for(int i = 0; i<k; i++){
                if(!set.contains(i)){
                    ans++;
                }
            }
                if(cnt_k >= ans){
                    ans = cnt_k;
                }
            
            out.println(ans);
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