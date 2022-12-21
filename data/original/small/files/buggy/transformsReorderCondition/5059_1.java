private static void tabIndent(int indent, java.io.PrintWriter out) {
    indent = 4 * indent;
    for (int i = 0; i < indent; ++i) {
        out.print(" ");
    }
}
