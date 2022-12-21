public void execute() {
    try {
        for (com.intellij.openapi.module.Module module : toRemove) {
            module.clearOption(PantsConstants.PANTS_TARGET_ADDRESSES_KEY);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
