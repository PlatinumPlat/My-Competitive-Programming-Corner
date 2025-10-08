import java.util.*;

public class Ulam_Spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int direction = 0;
        int time = 0;
        int total = 1;
        int totaltime = 0;
        int[] curr = { (N + 3) / 2, (N + 3) / 2 };
        int num = 2;
        int[][] area = new int[N + 3][N + 3];
        area[curr[0]][curr[1]] = 1;
        while (num <= N * N) {
            if (direction == 0) {
                curr[1]++;
                time++;
                if (time == total) {
                    time = 0;
                    direction = 2;
                    totaltime++;
                    if (totaltime==2) {
                        total++;
                        totaltime=0;
                    }
                }
            } else if (direction == 1) {
                curr[1]--;
                time++;
                if (time == total) {
                    time = 0;
                    direction = 3;
                    totaltime++;
                    if (totaltime == 2) {
                        total++;
                        totaltime = 0;
                    }
                }
            } else if (direction == 2) {
                curr[0]--;
                time++;
                if (time == total) {
                    time = 0;
                    direction = 1;
                    totaltime++;
                    if (totaltime == 2) {
                        total++;
                        totaltime = 0;
                    }
                }
            } else {
                curr[0]++;
                time++;
                if (time == total) {
                    time = 0;
                    direction = 0;
                    totaltime++;
                    if (totaltime == 2) {
                        total++;
                        totaltime = 0;
                    }
                }
            }
            area[curr[0]][curr[1]] = num;
            num++;
        }

        for (int i = 0; i < N + 3; i++) {
            boolean contains = false;
            for (int a = 0; a < N + 3; a++) {
                if (area[i][a] != 0) {
                    contains = true;
                }
            }

            if (contains) {
                boolean first = false;
                for (int a = 0; a < N + 3; a++) {
                    if (area[i][a] != 0) {
                        if (!first) {
                            if (area[i][a]<10) {
                                System.out.print("  ");
                            } else if (area[i][a]<100) {
                                System.out.print(" ");
                            }
                            System.out.print(area[i][a]);
                            first = true;
                        } else {
                            System.out.print(" ");
                            if (area[i][a] < 10) {
                                System.out.print("  ");
                            } else if (area[i][a] < 100) {
                                System.out.print(" ");
                            }
                            System.out.print(area[i][a]);
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
