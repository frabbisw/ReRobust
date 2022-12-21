void appendLine(java.lang.String aLine) {
    if ((out) == null)
        return;
    util.trace.Tracer.info(this, aLine);
    out.println(aLine);
    try {
        out.flush();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
