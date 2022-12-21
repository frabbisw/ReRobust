public boolean isSuspended() {
    try {
        if (((isInExile()) && (hasAbility(MagicAbility.Suspend))) && (hasCounters(MagicCounterType.Time))) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
