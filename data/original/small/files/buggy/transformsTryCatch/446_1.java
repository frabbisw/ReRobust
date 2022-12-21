private static void write(int lvl, java.lang.Object[] objs) {
    boolean writeToStdout = lvl <= (water.util.Log.currentLevel);
    try {
        water.util.Log.write0(lvl, writeToStdout, objs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
