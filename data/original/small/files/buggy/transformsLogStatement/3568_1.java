@java.lang.Override
public void info(@javax.annotation.Nonnull java.lang.Object msg) {
    System.out.println("log");
    if (org.apache.log4j.Level.INFO.isGreaterOrEqual(level)) {
        java.lang.System.out.println(("[INFO]\t" + (wrapMsg(msg))));
    }
}
