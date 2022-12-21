private boolean isEqualityLiteral(final de.uni_freiburg.informatik.ultimate.smtinterpol.util.SymmetricPair<de.uni_freiburg.informatik.ultimate.smtinterpol.theory.cclosure.CCTerm> termPair) {
    if (mEqualityLiterals.containsKey(termPair)) {
        if (0 > (mEqualityLiterals.get(termPair).getSign())) {
            return true;
        }
    }
    return false;
}
