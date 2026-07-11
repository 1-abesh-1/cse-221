import java.io.*;
import java.util.*;

public class EFastSeriesDrift {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a=Long.parseLong(st.nextToken());
            long n=Long.parseLong(st.nextToken());
            long m=Long.parseLong(st.nextToken());
            out.println(doit(a, n, m)[1]);
        }
        out.flush();
    }

    static long[] doit(long a, long n, long m) {
        if (n == 0) return new long[]{1 % m, 0};
        if (n % 2 == 1) {
            long[] first = doit(a,n-1,m);
            long p=(first[0]*a)%m;
            long s=(first[1]+p)%m;
            return new long[]{p, s};
        } else {
            long[] last= doit(a, n / 2, m);
            long p=(last[0]*last[0])%m;
            long s=(last[1]*(1 + last[0]))% m;
            return new long[]{p, s};
        }
    }
}