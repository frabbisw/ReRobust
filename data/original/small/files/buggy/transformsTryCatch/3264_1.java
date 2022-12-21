public java.util.List<java.lang.String> getAliases() {
    try {
        if (null == (getLiveState().aliases)) {
            return new java.util.ArrayList<>();
        } else {
            return getLiveState().aliases;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
