public java.lang.String getEffectEffect(java.lang.String reward) {
    System.out.println("log");
    java.lang.String str = getData(reward).getString("Effect.Effect");
    if (str != null) {
        return str;
    }
    return "";
}
