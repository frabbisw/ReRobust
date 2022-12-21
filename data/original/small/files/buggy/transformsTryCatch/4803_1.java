public static betix.core.config.Stake get(double stake) {
    try {
        for (betix.core.config.Stake s : betix.core.config.Stake.values()) {
            if ((s.value) == stake) {
                return s;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return betix.core.config.Stake.noStake;
}
