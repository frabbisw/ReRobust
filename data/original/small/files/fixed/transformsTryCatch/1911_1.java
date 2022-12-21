public static android.net.Uri appendProfileWithDefault(final java.lang.String profile, final android.net.Uri uri) {
    try {
        if (profile == null) {
            return org.mozilla.gecko.db.DBUtils.appendProfile(GeckoProfile.DEFAULT_PROFILE, uri);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return org.mozilla.gecko.db.DBUtils.appendProfile(profile, uri);
}
