@java.lang.Override
public void setLanguage(java.lang.String language) {
    try {
        data.put(LANG, language);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
