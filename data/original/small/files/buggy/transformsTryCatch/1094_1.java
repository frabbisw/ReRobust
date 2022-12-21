private boolean isEqualityLiteral(final de.uni_freiburg.informatik.ultimate.smtinterpol.util.SymmetricPair<de.uni_freiburg.informatik.ultimate.smtinterpol.theory.cclosure.CCTerm> termPair) {
    try {
        if (mEqualityLiterals.containsKey(termPair)) {
            if ((mEqualityLiterals.get(termPair).getSign()) < 0) {
                return true;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
