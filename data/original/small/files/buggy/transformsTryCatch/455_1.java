private boolean skipLang(java.lang.String langToCheck, java.util.List<java.lang.String> langs) {
    try {
        for (java.lang.String lang : langs) {
            if (langToCheck.contains(lang)) {
                return false;
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
