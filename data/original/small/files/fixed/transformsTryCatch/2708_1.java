public de.uni_freiburg.informatik.ultimate.logic.TermVariable addInVar(final de.uni_freiburg.informatik.ultimate.modelcheckerutils.cfg.variables.IProgramVar key, final de.uni_freiburg.informatik.ultimate.logic.TermVariable value) {
    try {
        if (mConstructionFinished) {
            throw new java.lang.IllegalStateException("Construction finished, TransFormula must not be modified.");
        } else {
            return mInVars.put(key, value);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
