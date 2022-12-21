java.lang.String getToken() {
    try {
        if ((viewInfo) != null) {
            return viewInfo.getViewID();
        } else {
            return null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
