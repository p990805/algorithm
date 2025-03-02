import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class CodeTree_Trail5_Chapter5_Lesson1_Basic {
    static int n, m;
    static int[][] arr;
    static boolean[] visited;
    static int[] dist;

    static void dijkstra(int start) {
        dist[start] = 0;

        // n번 반복하며 아직 방문하지 않은 정점 중 최단 거리를 가진 정점을 선택
        for (int i = 0; i < n; i++){
            int minIndex = -1;
            for (int j = 1; j <= n; j++){
                if (!visited[j] && (minIndex == -1 || dist[j] < dist[minIndex])){
                    minIndex = j;
                }
            }

            // 더 이상 연결된 정점이 없으면 종료
            if (dist[minIndex] == MAX_VALUE) break;
            visited[minIndex] = true;

            // minIndex 정점을 거쳐 다른 정점까지의 최단 거리를 갱신
            for (int j = 1; j <= n; j++){
                if (arr[minIndex][j] != 0 && dist[minIndex] + arr[minIndex][j] < dist[j]){
                    dist[j] = dist[minIndex] + arr[minIndex][j];
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = parseInt(st.nextToken());
        m = parseInt(st.nextToken());

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        dist = new int[n + 1];
        Arrays.fill(dist, MAX_VALUE);

        // 간선의 개수 m만큼 반복하여 간선 정보를 입력받음
        for (int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = parseInt(st.nextToken());
            int y = parseInt(st.nextToken());
            int z = parseInt(st.nextToken());
            arr[x][y] = z;
        }

        dijkstra(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++){
            int a = (dist[i] == MAX_VALUE ? -1 : dist[i]);
            sb.append(a).append("\n");
        }
        System.out.println(sb.toString().trim());
    }
}
