package Day2_Day3_Day4;

import java.util.*;

public class Two_dimensional_maze {
    static int n,m;
    static char[][] maze;
    static boolean[][] visited;
    static int minSteps = Integer.MAX_VALUE;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        maze = new char[n][m];
        visited = new boolean[n][m];

        int startx = 0,starty = 0;

        for(int i = 0;i < n; i++){
            String line = sc.nextLine();
            for(int j = 0;j < m;j++){
                maze[i][j] = line.charAt(j);
                if(maze[i][j] == 'S'){
                    startx = i;
                    starty = j;
                }
            }
        }

        visited[startx][starty] = true;
        dfs(startx,starty,0);

        if(minSteps == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(minSteps);
        }
    }

    static void dfs(int x,int y,int steps){
        if(maze[x][y] == 'T'){
            minSteps = Math.min(minSteps,steps);
            return;
        }
        for(int i = 0;i < 4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < n && ny >= 0 && ny < m && visited[nx][ny] == false &&maze[nx][ny] != '#'){
                visited[nx][ny] = true;
                dfs(nx,ny,steps + 1);
                visited[nx][ny] = false;
            }
        }
    }
}
