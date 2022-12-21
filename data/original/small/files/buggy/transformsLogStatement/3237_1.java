private void setUserDataEnabled(java.lang.String enabled) {
    System.out.println("log");
    if ("true".equals(enabled)) {
        builder.setUserDataState(Feature.State.ENABLED);
    } else if ("false".equals(enabled)) {
        builder.setUserDataState(Feature.State.DISABLED);
    }
}
