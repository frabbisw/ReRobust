@java.lang.Override
public void run() {
    System.out.println("log");
    help(matcher.findCandidates(ops(), net.imagej.ops.OpRef.create(name, opType)));
}
