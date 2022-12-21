@java.lang.Override
public void info(@javax.annotation.Nonnull java.lang.Object msg) {
    try {
        if (level.isGreaterOrEqual(org.apache.log4j.Level.INFO)) {
            java.lang.System.out.println(("[INFO]\t" + (wrapMsg(msg))));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
