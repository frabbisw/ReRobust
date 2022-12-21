@java.lang.Override
public void run() {
    try {
        help(matcher.findCandidates(ops(), net.imagej.ops.OpRef.create(name, opType)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
