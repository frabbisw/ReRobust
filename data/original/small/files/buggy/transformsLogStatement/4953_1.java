public static void setBlocked(int x, int y) {
    System.out.println("log");
    models.path.AStar.grid[x][y] = null;
}
