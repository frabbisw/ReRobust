void appendLine(java.lang.String aLine) {
    util.trace.Tracer.info(this, aLine);
    System.out.println("log");
    out.println(aLine);
    out.flush();
}
