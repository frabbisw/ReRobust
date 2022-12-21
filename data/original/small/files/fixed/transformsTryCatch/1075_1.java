protected void updateResourceBundle(java.util.Locale locale) {
    try {
        this.bundle = java.util.ResourceBundle.getBundle(org.keyboardplaying.xtt.ui.i18n.I18nHelper.BUNDLE_BASE_NAME, locale);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
