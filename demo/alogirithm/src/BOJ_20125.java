import java.io.*;

import static java.lang.Integer.parseInt;

public class BOJ_20125 {
    static int n;
    static char[][] cookieMan;
    static int heart_row;
    static int heart_col;
    static int cookieManLegStartX;
    static int cookieManLegStartY;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static StringBuilder sb = new StringBuilder();

    static boolean valid(int nx, int ny) {
        return 0 <= nx && nx < n && 0 <= ny && ny < n;
    }

    static void checkHeart(int x, int y) {
        if (cookieMan[x][y] != '*') return;

        boolean isHeart = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (!valid(nx, ny) || cookieMan[nx][ny] != '*') {
                isHeart = false;
                break;
            }
        }
        if (isHeart) {
            heart_row = x;
            heart_col = y;
        }
    }

    static void checkLeftArm(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < y; i++) {
            if (cookieMan[x][i] == '*') {
                cnt++;
            }
        }
        sb.append(cnt).append(" ");
    }

    static void checkRightArm(int x, int y) {
        int cnt = 0;
        for (int i = y + 1; i < n; i++) {
            if (cookieMan[x][i] == '*') {
                cnt++;
            }
        }
        sb.append(cnt).append(" ");
    }

    static void checkBody(int x, int y) {
        int cnt = 0;
        for (int i = x + 1; i < n; i++) {
            if (cookieMan[i][y] == '*') {
                cnt++;
            } else {
                sb.append(cnt).append(" ");
                cookieManLegStartX = i;
                cookieManLegStartY = y;
                return;
            }
        }
        sb.append(cnt).append(" ");
    }

    static void checkLeg(int x, int y) {
        int cnt = 0;
        for (int i = cookieManLegStartX; i < n; i++) {
            if (valid(i, y) && cookieMan[i][y] == '*') {
                cnt++;
            }
        }
        sb.append(cnt).append(" ");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = parseInt(br.readLine());

        cookieMan = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < n; j++) {
                cookieMan[i][j] = line.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                checkHeart(i, j);
            }
        }
        sb.append(heart_row+1).append(" ").append(heart_col+1).append("\n");

        checkLeftArm(heart_row, heart_col);
        checkRightArm(heart_row, heart_col);
        checkBody(heart_row, heart_col);
        checkLeg(cookieManLegStartX, heart_col - 1);
        checkLeg(cookieManLegStartX, heart_col + 1);

        System.out.println(sb.toString().trim());
    }
}