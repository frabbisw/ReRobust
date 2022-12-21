private boolean isEqualityLiteral(final de.uni_freiburg.informatik.ultimate.smtinterpol.util.SymmetricPair<de.uni_freiburg.informatik.ultimate.smtinterpol.theory.cclosure.CCTerm> termPair) {
    System.out.println("log");
    if (mEqualityLiterals.containsKey(termPair)) {
        if ((mEqualityLiterals.get(termPair).getSign()) < 0) {
            return true;
        }
    }
    return false;
}
