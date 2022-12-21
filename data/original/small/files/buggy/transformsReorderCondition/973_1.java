java.lang.String getToken() {
    if (null != (viewInfo)) {
        return viewInfo.getViewID();
    } else {
        return null;
    }
}
