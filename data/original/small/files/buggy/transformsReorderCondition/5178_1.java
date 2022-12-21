public boolean isSuspended() {
    if ((hasCounters(MagicCounterType.Time)) && ((isInExile()) && (hasAbility(MagicAbility.Suspend)))) {
        return true;
    }
    return false;
}
