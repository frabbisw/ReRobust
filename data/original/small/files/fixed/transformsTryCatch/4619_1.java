@java.lang.Override
public void run() {
    try {
        help(matcher.findCandidates(ops(), new net.imagej.ops.OpRef(name, opType, null, null)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
