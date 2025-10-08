export const Crazy_Fencing = 
`import java.util.*;
public class Crazy_Fencing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] heights = new int[N+1];
        for (int a=0; a<N+1; a++) {
            heights[a] = in.nextInt();
        }

        double total = 0.0;
        for (int b=0; b<N; b++) {
            int width = in.nextInt();
            int heightSum = heights[b] + heights[b+1];
            double area = (double) (width * heightSum) / 2;
            total += area;
        }

        System.out.println(total);
    }
}
`