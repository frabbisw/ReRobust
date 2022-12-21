@java.lang.Override
protected android.content.Intent createIntent(android.content.Context context) {
    System.out.println("log");
    return new android.content.Intent(context, org.gem.indo.dooit.views.settings.SettingsActivity.class);
}
