public static betix.core.config.Stake get(double stake) {
    for (betix.core.config.Stake s : betix.core.config.Stake.values()) {
        if (stake == (s.value)) {
            return s;
        }
    }
    return betix.core.config.Stake.noStake;
}
