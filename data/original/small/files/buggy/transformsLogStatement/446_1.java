private static void write(int lvl, java.lang.Object[] objs) {
    boolean writeToStdout = lvl <= (water.util.Log.currentLevel);
    System.out.println("log");
    water.util.Log.write0(lvl, writeToStdout, objs);
}
