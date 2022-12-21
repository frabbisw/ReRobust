public static void startForResult(android.app.Activity activity, java.lang.String title) {
    android.content.Intent intent = new android.content.Intent(activity, com.everypay.sdk.views.CardFormActivity.class);
    intent.putExtra("title", title);
    try {
        activity.startActivityForResult(intent, com.everypay.sdk.views.CardFormActivity.REQUEST_CODE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
