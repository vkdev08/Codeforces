import java.io.*;
import java.util.*;

public class A_El_fucho {

    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        // Your logic here
        int t = fs.nextInt();
        while (t-- > 0) {
            // solve each test case here
            int win = fs.nextInt();
            int loss = 0;
            int matches = 0;
            while(!(win == loss && win == 1)){
                //winners matches
                int m = win/2;
                win -= m;
                loss += m;
                matches += m;
                if(win == loss && win == 1){
                    break;
                }
                //loser matches
                m = loss/2;
                loss -= m;
                matches += m;
            }
            out.println(matches + 1);
            
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