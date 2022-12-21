public static void init(android.app.Application application) {
    try {
        com.parse.Parse.initialize(application, com.rndapp.mtamap.Analytics.PARSE_KEY_ONE, com.rndapp.mtamap.Analytics.PARSE_KEY_TWO);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
