public java.lang.String getUrl() {
    try {
        if (android.text.TextUtils.isEmpty(url))
            return "";
        else
            return url;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
