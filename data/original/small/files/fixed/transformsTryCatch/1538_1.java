public com.jeffreythomasprice.game.HashCodeBuilder append(boolean x) {
    try {
        result = ((result) * (com.jeffreythomasprice.game.HashCodeBuilder.MULTIPLIER)) + (new java.lang.Boolean(x).hashCode());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
