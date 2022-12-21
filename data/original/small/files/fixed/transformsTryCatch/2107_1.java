@java.lang.Override
public org.exist.xquery.value.Sequence postEval(org.exist.xquery.value.Sequence seq) throws org.exist.xquery.XPathException {
    try {
        if ((returnExpr) instanceof org.exist.xquery.FLWORClause) {
            seq = ((org.exist.xquery.FLWORClause) (returnExpr)).postEval(seq);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return super.postEval(seq);
}
