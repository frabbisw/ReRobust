public static void startForResult(android.app.Activity activity) {
    android.content.Intent intent = new android.content.Intent(activity, com.everypay.sdk.views.CardFormActivity.class);
    try {
        activity.startActivityForResult(intent, com.everypay.sdk.views.CardFormActivity.REQUEST_CODE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
