private static void tabIndent(int indent, java.io.PrintWriter out) {
    indent = indent * 4;
    try {
        for (int i = 0; i < indent; ++i) {
            out.print(" ");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
