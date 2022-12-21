public void setLanguage(com.mapswithme.maps.sound.LanguageData lang) {
    try {
        if (lang != null)
            setLanguageInternal(lang);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
