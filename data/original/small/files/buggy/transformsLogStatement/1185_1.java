public static final ru.sbtqa.tag.qautils.i18n.I18N getI18n(java.lang.Class callerClass, java.lang.String bundlePath) {
    System.out.println("log");
    return ru.sbtqa.tag.qautils.i18n.I18N.getI18n(callerClass, java.util.Locale.getDefault(), "i18n");
}
