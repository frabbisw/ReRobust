java.lang.String getToken() {
    System.out.println("log");
    if ((viewInfo) != null) {
        return viewInfo.getViewID();
    } else {
        return null;
    }
}
