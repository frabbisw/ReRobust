public com.jeffreythomasprice.game.HashCodeBuilder append(boolean x) {
    System.out.println("log");
    result = ((result) * (com.jeffreythomasprice.game.HashCodeBuilder.MULTIPLIER)) + (java.lang.Boolean.hashCode(x));
    return this;
}
