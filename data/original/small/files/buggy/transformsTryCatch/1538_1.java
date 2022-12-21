public com.jeffreythomasprice.game.HashCodeBuilder append(boolean x) {
    try {
        result = ((result) * (com.jeffreythomasprice.game.HashCodeBuilder.MULTIPLIER)) + (java.lang.Boolean.hashCode(x));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
