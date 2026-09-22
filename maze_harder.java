package Day2_Day3_Day4;

import java.util.*;

public class maze_harder {
    static int N,M,T;
    static char[][] maze;
    static boolean[][]visited;
    static int path;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int SX,SY,FX,FY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();

        maze = new char[N][M];
        visited = new boolean[N][M];

        SX = sc.nextInt();
        SY = sc.nextInt();
        FX = sc.nextInt();
        FY = sc.nextInt();
        SX--;SY--;FX--;FY--;


        for(int i = 0 ; i < N; i++){
            for(int j = 0 ; j < M; j++){
                    maze[i][j] = '.';
                }
            }

        for(int i = 0 ; i < T ; i++){
            int ox = sc.nextInt();
            int oy = sc.nextInt();
            ox--;oy--;
            maze[ox][oy] = '#';
        }

        maze[FX][FY] = 'F';
        maze[SX][SY] = 'S';

        visited[SX][SY] = true;
        dfs(SX,SY);

        System.out.println(path);
    }

    static void dfs(int x,int y) {
        if(x == FX && y == FY){
            path++;
            return;
        }else{
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny] && maze[nx][ny] != '#') {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                    visited[nx][ny] = false;
                }
            }
        }
    }
}
