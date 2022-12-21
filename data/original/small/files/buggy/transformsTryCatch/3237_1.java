private void setUserDataEnabled(java.lang.String enabled) {
    try {
        if ("true".equals(enabled)) {
            builder.setUserDataState(Feature.State.ENABLED);
        } else if ("false".equals(enabled)) {
            builder.setUserDataState(Feature.State.DISABLED);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
