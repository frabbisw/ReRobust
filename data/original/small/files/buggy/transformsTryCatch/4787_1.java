@org.junit.Test
public void testLimitCheckIncorrect() {
    boolean limitReached = this.player.balanceExceedsLimitBy(this.bet);
    try {
        assertFalse(limitReached);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
