@java.lang.Override
public int getEndLine() {
    try {
        if ((parser) != null) {
            return org.jetbrains.kotlin.diagnostics.DiagnosticUtils.offsetToLineAndColumn(parser.getDocument(), innerNode.getTextRange().getEndOffset()).getLine();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return 1000;
}
