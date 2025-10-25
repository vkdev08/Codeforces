import java.io.*;
import java.util.*;

public class A_Be_Positive {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        // Your logic here
        int t = fs.nextInt();
        while (t-- > 0) {
            // solve each test case here
            int n = fs.nextInt();
            int cnt_z = 0;
            int cnt_n1 = 0;
            for(int i = 0; i<n; i++){
                int num = fs.nextInt();
                if(num == 0){
                    cnt_z ++;
                }else if(num == -1){
                    cnt_n1 ++;
                }
            }
            if(cnt_n1 % 2 == 0){
                out.println(cnt_z);
            }else{
                out.println(cnt_z + 2*(cnt_n1%2));
            }
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