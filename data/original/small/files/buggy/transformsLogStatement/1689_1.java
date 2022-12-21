@java.lang.Override
public int getEndLine() {
    System.out.println("log");
    if ((parser) != null) {
        return org.jetbrains.kotlin.diagnostics.DiagnosticUtils.offsetToLineAndColumn(parser.getDocument(), innerNode.getTextRange().getEndOffset()).getLine();
    }
    return 1000;
}
