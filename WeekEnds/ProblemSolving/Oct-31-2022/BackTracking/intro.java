class intro{
    public static void main(String[] args) {
       


    }
    public static boolean floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {
    if (sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 ||
        visited[sr][sc] == true) {
      return false;
    }
    if (sr == maze.length - 1 && sc == maze[0].length - 1) {
      System.out.println(asf);
      return true;
    }
    visited[sr][sc] = true;  // mark my current position as visited 
    boolean ans = false;
    ans = ans || floodfill(maze, sr - 1, sc, asf + "t", visited);
    ans = ans || floodfill(maze, sr, sc - 1, asf + "l", visited);
    ans = ans || floodfill(maze, sr + 1, sc, asf + "d", visited);
    ans = ans || floodfill(maze, sr, sc + 1, asf + "r", visited);

    return ans;

  }
}