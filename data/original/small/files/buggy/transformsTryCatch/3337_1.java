public static void init(android.app.Application application) {
    com.parse.Parse.initialize(application, com.rndapp.mtamap.Analytics.PARSE_KEY_ONE, com.rndapp.mtamap.Analytics.PARSE_KEY_TWO);
    try {
        com.flurry.android.FlurryAgent.init(application, com.rndapp.mtamap.Analytics.FLURRY_KEY);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
