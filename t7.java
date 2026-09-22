package test;

import java.util.*;
import java.io.*;

public class t7 {
    static int n,m;
    static char[][]maze;
    static boolean[][] visited;
    static int minsteps = Integer.MAX_VALUE;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        maze = new char[n][m];
        visited =new boolean[n][m];

        int startx= 0, starty= 0;
        for(int i = 0;i < n; i++){
            String line = sc.nextLine();
            for(int j = 0;j < m; j++){
                maze[i][j] = line.charAt(j);
                if(maze[i][j] == 'S'){
                    startx = i;
                    starty = j;
                }
            }
        }

        visited[startx][starty] = false;

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};


        dfs(0,0,0);
        if(minsteps == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(minsteps);
        }
    }

    public static void dfs(int x,int y,int steps){
        if(maze[x][y] == 'T'){
            minsteps = Math.min(steps,minsteps);
            return;
        }else{
            for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m && maze[nx][ny] != '#' && visited[nx][ny] == false){
                visited[nx][ny] = true;
                dfs(nx,ny,steps + 1);
                visited[nx][ny] = false;
                }
            }
        }
    }
}
