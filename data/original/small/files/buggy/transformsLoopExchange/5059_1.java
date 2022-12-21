private static void tabIndent(int indent, java.io.PrintWriter out) {
    indent = indent * 4;
    {
        int i = 0;
        while (i < indent) {
            out.print(" ");
            ++i;
        }
    }
}
