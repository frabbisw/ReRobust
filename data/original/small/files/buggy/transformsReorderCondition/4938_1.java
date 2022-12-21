public java.lang.String getEffectEffect(java.lang.String reward) {
    java.lang.String str = getData(reward).getString("Effect.Effect");
    if (null != str) {
        return str;
    }
    return "";
}
