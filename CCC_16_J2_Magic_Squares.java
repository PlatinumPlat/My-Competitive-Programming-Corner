import java.util.*;

public class CCC_16_J2_Magic_Squares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();
        int n6 = in.nextInt();
        int n7 = in.nextInt();
        int n8 = in.nextInt();
        int n9 = in.nextInt();
        int n10 = in.nextInt();
        int n11 = in.nextInt();
        int n12 = in.nextInt();
        int n13 = in.nextInt();
        int n14 = in.nextInt();
        int n15 = in.nextInt();
        int n16 = in.nextInt();

        long sum1 = n1+n2+n3+n4;
        long sum2 = n5+n6+n7+n8;
        long sum3 = n9+n10+n11+n12;
        long sum4 = n13+n14+n15+n16;

        long sum5 = n1+n5+n9+n13;
        long sum6 = n2+n6+n10+n14;
        long sum7 = n3+n7+n11+n15;
        long sum8 = n4+n8+n12+n16;

        if (sum1==sum2 && sum2==sum3 && sum3==sum4 && sum4==sum5 && sum5==sum6 && sum6==sum7 && sum7==sum8) {
            System.out.println("magic");
        } else {
            System.out.println("not magic");
        }

    }
}