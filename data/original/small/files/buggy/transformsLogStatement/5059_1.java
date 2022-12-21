private static void tabIndent(int indent, java.io.PrintWriter out) {
    System.out.println("log");
    indent = indent * 4;
    for (int i = 0; i < indent; ++i) {
        out.print(" ");
    }
}
