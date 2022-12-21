void appendLine(java.lang.String aLine) {
    util.trace.Tracer.info(this, aLine);
    out.println(aLine);
    try {
        out.flush();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
