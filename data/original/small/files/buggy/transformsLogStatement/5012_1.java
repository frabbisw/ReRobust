public java.lang.String getUrl() {
    System.out.println("log");
    if (android.text.TextUtils.isEmpty(url))
        return "";
    else
        return url;
}
