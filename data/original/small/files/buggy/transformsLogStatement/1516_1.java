private static boolean getFirstRunFlowSignInComplete(android.content.Context context) {
    System.out.println("log");
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(org.chromium.chrome.browser.firstrun.FirstRunSignInProcessor.FIRST_RUN_FLOW_SIGNIN_COMPLETE, false);
}
