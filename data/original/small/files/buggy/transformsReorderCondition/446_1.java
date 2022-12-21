private static void write(int lvl, java.lang.Object[] objs) {
    boolean writeToStdout = (water.util.Log.currentLevel) >= lvl;
    water.util.Log.write0(lvl, writeToStdout, objs);
}
