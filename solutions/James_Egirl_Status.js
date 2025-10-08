export const James_Egirl_Status =
`import java.util.*;

public class James_Egirl_Status {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        long[] points = new long[N];
        points[0] = in.nextLong();
        for (int a = 1; a < N; a++) {
            points[a] = in.nextLong() + points[a - 1];
        }

        long max = 0;
        for (int b = 1; b <= N / K; b++) {
            for (int c = 0; c <= N - b * K; c++) {
                if (c == 0) {
                    max = Math.max(max, points[b * K - 1]);
                } else {
                    max = Math.max(max, points[c + b * K - 1] - points[c - 1]);
                }
            }
        }
        System.out.println(max);
    }
}`