public int getPulseOutDuration() {
    try {
        if (getOverwriteValue()) {
            return Settings.System.getIntForUser(mContext.getContentResolver(), Settings.System.DOZE_PULSE_DURATION_OUT, R.integer.doze_pulse_duration_out, UserHandle.USER_CURRENT);
        } else {
            return getInt("doze.pulse.duration.out", R.integer.doze_pulse_duration_out);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
